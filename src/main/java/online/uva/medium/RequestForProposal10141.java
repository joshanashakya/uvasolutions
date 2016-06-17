package online.uva.medium;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class RequestForProposal10141 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        int rfpSequence = 1;

        while (n != 0 && p != 0) {
            sc.nextLine();
            String[] requirements = new String[n];
            for (int i = 0; i < n; i++) {
                requirements[i] = sc.nextLine();
            }

            Map<String, RequirementValue> proposals = new LinkedHashMap<String, RequirementValue>();

            for (int j = 0; j < p; j++) {
                RequirementValue value = new RequirementValue();

                String proposalName = sc.nextLine();

                value.setPrice(Double.parseDouble(sc.next()));

                value.setRequirement(Integer.parseInt(sc.next()));

                sc.nextLine();

                for (int k = 0; k < value.getRequirement(); k++) {
                    sc.nextLine();
                }
                proposals.put(proposalName, value);
            }

            if (rfpSequence != 1) {
                System.out.println();
            }

            System.out.println("RFP #" + rfpSequence);

            System.out.println(compliance(n, proposals));

            n = sc.nextInt();
            p = sc.nextInt();

            rfpSequence++;
        }
        sc.close();
    }

    private static String compliance(int n, Map<String, RequirementValue> proposals) {
        Collection<RequirementValue> v = proposals.values();
        RequirementValue max = Collections.max(v);

        if (max.getRequirement() == n) {
            Set<String> selectedProposal = proposals.entrySet().stream()
                    .filter(entry -> Objects.equals(entry.getValue(), max)).map(Map.Entry::getKey)
                    .collect(Collectors.toSet());

            Iterator it = selectedProposal.iterator();

            return it.next().toString();

        } else {
            Map<String, ComplianceValue> complianceMap = new LinkedHashMap<String, ComplianceValue>();
            for (String key : proposals.keySet()) {

                RequirementValue rValue = proposals.get(key);

                ComplianceValue cValue = new ComplianceValue();

                cValue.setCompliance((double) rValue.getRequirement() / n);

                cValue.setPrice(rValue.getPrice());

                complianceMap.put(key, cValue);
            }

            Collection<ComplianceValue> cv = complianceMap.values();

            ComplianceValue cmax = Collections.max(cv);

            Set<String> selectedProposal = complianceMap.entrySet().stream()
                    .filter(entry -> Objects.equals(entry.getValue(), cmax)).map(Map.Entry::getKey)
                    .collect(Collectors.toSet());

            Iterator it = selectedProposal.iterator();

            return it.next().toString();

        }
    }

    private static class Value {
        private double price;

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

    }

    private static class RequirementValue extends Value implements Comparable<RequirementValue> {
        private int requirement;

        public int getRequirement() {
            return requirement;
        }

        public void setRequirement(int requirement) {
            this.requirement = requirement;
        }

        @Override
        public int compareTo(RequirementValue o) {
            int result = this.getRequirement() < o.getRequirement() ? -1
                    : (this.getRequirement() > o.getRequirement() ? 1 : 0);

            if (result != 0) {
                return result;
            }
            return this.getPrice() > o.getPrice() ? -1 : (this.getPrice() < o.getPrice() ? 1 : 0);

        }
    }

    private static class ComplianceValue extends Value implements Comparable<ComplianceValue> {
        private double compliance;

        public double getCompliance() {
            return compliance;
        }

        public void setCompliance(double compliance) {
            this.compliance = compliance;
        }

        @Override
        public int compareTo(ComplianceValue o) {
            int result = this.getCompliance() < o.getCompliance() ? -1 : (this.getCompliance() > o.getCompliance() ? 1
                    : 0);

            if (result != 0) {
                return result;
            }
            return this.getPrice() > o.getPrice() ? -1 : (this.getPrice() < o.getPrice() ? 1 : 0);

        }
    }

}
