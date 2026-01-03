import java.util.Scanner;
class InterchangeEvery2Characters{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String orginalString = sc.nextLine();
        String interchangedString = "";
        if(orginalString.length() % 2 == 0){
            for(int i = 0; i < orginalString.length(); i += 2){
                interchangedString += orginalString.charAt(i + 1);
                interchangedString += orginalString.charAt(i);
            }
            System.out.println("Interchanged string: " + interchangedString);
        } else {
            for(int i = 0; i < orginalString.length() - 1; i += 2){
                interchangedString += orginalString.charAt(i + 1);
                interchangedString += orginalString.charAt(i);
            }
            interchangedString += orginalString.charAt(orginalString.length() - 1);
            System.out.println("Interchanged string: " + interchangedString);
        }
    }
} 