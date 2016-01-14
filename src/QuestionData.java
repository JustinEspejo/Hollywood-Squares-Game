import java.util.Random;

public class QuestionData {

    private String[][] question;
    private int questionNo;

    public QuestionData(){

        // sample size for now for testing
        question = new String[4][4];
        question[0][0] = "Pluto is the largest object in the Kuiper belt?";
        question[0][1] = "true";
        question[1][0] = "Eris is the most massive dwarf planet known in our Solar System?";
        question[1][1] = "false";
        question[2][0] = "The programming language C++ designed by Dennis Ritchie?";
        question[2][1] = "false";
        question[3][0] = "A Dog's nose print is as unique as a human fingerprint?";
        question[3][1] = "true";
    }

    public String getQuestion(){

        int random = (int) (Math.random()*question.length);
        questionNo = random;
        return question[random][0];

    }

    public boolean checkAnswer(boolean answer, boolean fakeAnswer){

        if(answer == true && fakeAnswer == true && question[questionNo][1].equals(Boolean.toString(true))) return true;
        
        if(answer == false && fakeAnswer == false && question[questionNo][1].equals(Boolean.toString(true))) return true;
        
        if(answer == true && fakeAnswer == false && question[questionNo][1].equals(Boolean.toString(false))) return true;
        
        if(answer == false && fakeAnswer == true && question[questionNo][1].equals(Boolean.toString(false))) return true;
        
        if(answer == false && fakeAnswer == true && question[questionNo][1].equals(Boolean.toString(true))) return false;
        
        if(answer == true && fakeAnswer == false && question[questionNo][1].equals(Boolean.toString(true))) return false;
        
        if(answer == false && fakeAnswer == false && question[questionNo][1].equals(Boolean.toString(false))) return false;
        
        if(answer == true && fakeAnswer == true && question[questionNo][1].equals(Boolean.toString(false))) return false;
        
        else
            return false;

    }

    public String generateFakeAnswer() {

        String GeneratedAnswer = "";
        int answer = (int) (Math.random()*2);

        if (answer == 0) {
            return GeneratedAnswer = "true";
        }
        else {
            return GeneratedAnswer = "false";
        }

    }


}
