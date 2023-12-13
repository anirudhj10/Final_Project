/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organisation.Museum;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author anirudh
 */
public class MuseumQuestions {
    
    ArrayList<MuseumQuestion> museumQuestions = new ArrayList<>();

    public ArrayList<MuseumQuestion> getMuseumQuestions() {
        return museumQuestions;
    }

    public void setMuseumQuestions(ArrayList<MuseumQuestion> museumQuestions) {
        this.museumQuestions = museumQuestions;
    }

    public ArrayList<MuseumQuestion> findQuestionsforCustomer(int id) {
        ArrayList<MuseumQuestion> questions = new ArrayList<>();
        for(MuseumQuestion mq:museumQuestions)
        {
            if(mq.getCustomerId() == id)
                questions.add(mq);
        }
        return questions;
    }
    
    

    
    
    
}
