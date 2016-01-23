package com.ko.domain;

/**
 * Created by IntelliJ IDEA.
 * User: ammmoho
 * Time: 14:10:48
 * To change this template use File | Settings | File Templates.
 */
public class SuspectInvestigateList {
    private Long suspect_investigate_id;
    private String suspect_no;
    private String investigate_no;
    private String doc_date;
    private String offcode;
    private Long create_by;
    private String track_no;
    private String start_date;
    private String end_date;
    private String legislation_name;
    private String suspect_behavior;

    public String getTrack_no() {
        return track_no;
    }

    public void setTrack_no(String track_no) {
        this.track_no = track_no;
    }

    public Long getSuspect_investigate_id() {
        return suspect_investigate_id;
    }

    public void setSuspect_investigate_id(Long suspect_investigate_id) {
        this.suspect_investigate_id = suspect_investigate_id;
    }

    public String getSuspect_no() {
        return suspect_no;
    }

    public void setSuspect_no(String suspect_no) {
        this.suspect_no = suspect_no;
    }

    public String getInvestigate_no() {
        return investigate_no;
    }

    public void setInvestigate_no(String investigate_no) {
        this.investigate_no = investigate_no;
    }

    public String getDoc_date() {
        return doc_date;
    }

    public void setDoc_date(String doc_date) {
        this.doc_date = doc_date;
    }

    public String getOffcode() {
        return offcode;
    }

    public void setOffcode(String offcode) {
        this.offcode = offcode;
    }

    public Long getCreate_by() {
        return create_by;
    }

    public void setCreate_by(Long create_by) {
        this.create_by = create_by;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getLegislation_name() {
        return legislation_name;
    }

    public void setLegislation_name(String legislation_name) {
        this.legislation_name = legislation_name;
    }

    public String getSuspect_behavior() {
        return suspect_behavior;
    }

    public void setSuspect_behavior(String suspect_behavior) {
        this.suspect_behavior = suspect_behavior;
    }
}
