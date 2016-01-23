/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

/**
 *
 * @author Administrator
 */
public class GuiltBaseInfo {
    String case_law_id;
    String penalty_case_law_id;
    String guilt_base;
    String exhibit_wild;

    public String getCase_law_id(){
        return case_law_id;
    }
    public void setCase_law_id(String value){
        case_law_id=value;
    }

    public String getPenalty_case_law_id(){
        return penalty_case_law_id;
    }
    public void setPenalty_case_law_id(String value){
        penalty_case_law_id = value;
    }

    public String getGuilt_base(){
        return guilt_base;
    }
    public void setGuilt_base(String value){
        guilt_base = value;
    }

    public String getExhibit_wild(){
        return exhibit_wild;
    }
    public void setExhibit_wild(String value){
        exhibit_wild = value;
    }
}
