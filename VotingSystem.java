import java.util.*;

class Candidate {
    String name;
    int votes;

    Candidate(String n) {
        name = n;
        votes = 0;
    }
}

public class VotingSystem {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Candidate c1 = new Candidate("Raj Soni");
        Candidate c2 = new Candidate("Nitish Giri");

        ArrayList<Integer> list = new ArrayList<Integer>();

        int ch;

        do {
            System.out.println("\n1. Vote");
            System.out.println("2. Result");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter voter id: ");
                int id = sc.nextInt();

                if (list.contains(id)) {
                    System.out.println("Already voted");
                } else {
                    System.out.println("1. Raj Soni");
                    System.out.println("2. Nitish Giri");
                    System.out.print("Enter your vote: ");
                    int v = sc.nextInt();

                    if (v == 1) {
                        c1.votes = c1.votes + 1;
                        System.out.println("Vote done");
                    } else if (v == 2) {
                        c2.votes = c2.votes + 1;
                        System.out.println("Vote done");
                    } else {
                        System.out.println("Wrong choice");
                    }

                    list.add(id);
                }
            }

            else if (ch == 2) {
                System.out.println("\nRaj Soni votes: " + c1.votes);
                System.out.println("Nitish Giri votes: " + c2.votes);

                if (c1.votes > c2.votes) {
                    System.out.println("Winner is Raj Soni");
                } else if (c2.votes > c1.votes) {
                    System.out.println("Winner is Nitish Giri");
                } else {
                    System.out.println("Match Draw");
                }
            }

        } while (ch != 3);

        System.out.println("Program End");
    }
}