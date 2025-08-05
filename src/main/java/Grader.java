public class Grader {
    public char determineLetterGrade(int numberGrade){
        if(numberGrade < 0){
            throw new IllegalArgumentException("Grade can't be 0");
        }

        if(numberGrade < 60){
            return 'F';
        }

        if(numberGrade < 70){
            return 'D';
        }

        if(numberGrade < 80){
            return 'C';
        }

        if(numberGrade < 90){
            return 'B';
        }

        if (numberGrade <= 100) {
            return 'A';
        } else{
            throw new IllegalArgumentException("Grade can't more than 0");
        }


    }
}
