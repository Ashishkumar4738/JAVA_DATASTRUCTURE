import java.util.*;

public class JobSequencingProb {
    static class Job {
        int deadLine;
        int profit;
        int id;// 0,1,2

        public Job(int i, int d, int p) {
            id = i;
            deadLine = d;
            profit = p;
        }

    }

    public static void main(String[] args) {
        int jobInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jobInfo.length; i++) {
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }
        // now sort this arraylist of objects
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);// descending order
        print(jobs);
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadLine > time) {
                seq.add(curr.id);
                time++;
            }
        }
        // print seq
        System.out.println("max jobs = " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();

    }
    static void print(ArrayList<Job> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).profit+" ");
            
        }
        System.out.println();
    }
}
