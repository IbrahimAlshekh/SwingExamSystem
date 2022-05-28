/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SwingSinavSystem;

import java.util.HashMap;

/**
 *
 * @author Abir Elşekaki
 */
public class QuestionModel {
    private int id;
    private String text;
    private HashMap<String, String> options;
    private String currectAnswer;
    private String answer;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public HashMap<String, String> getOptions() {
        return options;
    }

    public void setOptions(HashMap<String, String> options) {
        this.options = options;
    }
    
    public void addOption(String key, String option) {
        
        if(this.options == null) this.options = new HashMap<>();
        
        this.options.put(key, option);
        
    }

    public String getCurrectAnswer() {
        return currectAnswer;
    }

    public void setCurrectAnswer(String currectAnswer) {
        this.currectAnswer = currectAnswer;
    }
    
    public boolean isCurrect()
    {   
        return this.answer.equals(this.currectAnswer);
    }
    
}
