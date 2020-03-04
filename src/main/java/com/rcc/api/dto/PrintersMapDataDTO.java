package com.rcc.api.dto;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Sheet("Sheet1")
//@JsonPropertyOrder({"place","alternative_name_or_spellings","state_province_or_district","press_name","alternative_name_or_spelling_of_press","name_of_newspaper_journal_printed","first_book_printed","beginning_year","beginning_month","ending_year","ending_month","date_notes","proprietor_founder","manager_superintendent","editor","printer","patron","location","date_est_or_earliest_record","source","id","notes","lat","long","startplace","endplace","photo_link","title_of_photo","photo_credit","added_by","comments","year"})
public class PrintersMapDataDTO {

    @SheetColumn("Place")
    private String place;
    @SheetColumn("Alternative Name or Spellings")
    private String alternative_name_or_spellings;
    @SheetColumn("State, Province, or District")
    private String state_province_or_district;
    @SheetColumn("Press Name")
    private String press_name;
    @SheetColumn("Alternative Name or Spelling of Press")
    private String alternative_name_or_spelling_of_press;
    @SheetColumn("Name of Newspaper/Journal printed")
    private String name_of_newspaper_journal_printed;
    @SheetColumn("First Book printed")
    private String first_book_printed;
    @SheetColumn("Beginning Year")
    private String beginning_year;
    @SheetColumn("Beginning Month")
    private String beginning_month;
    @SheetColumn("Ending Year")
    private String ending_year;
    @SheetColumn("Ending Month")
    private String ending_month;
    @SheetColumn("Date Notes")
    private String date_notes;
    @SheetColumn("Proprietor/Founder")
    private String proprietor_founder;
    @SheetColumn("Manager/Superintendent")
    private String manager_superintendent;
    @SheetColumn("Editor")
    private String editor;
    @SheetColumn("Printer")
    private String printer;
    @SheetColumn("Patron")
    private String patron;
    @SheetColumn("Location")
    private String location;
    @SheetColumn("Date est. or Earliest record")
    private String date_est_or_earliest_record;
    @SheetColumn("Source")
    private String source;
    @SheetColumn("ID")
    private String id;
    @SheetColumn("Notes")
    private String notes;
    @SheetColumn("Lat")
    private String lat;
    @SheetColumn("Long")
    private String lon;
    @SheetColumn("StartPlace")
    private String startplace;
    @SheetColumn("EndPlace")
    private String endplace;
    @SheetColumn("Photo Link")
    private String photo_link;
    @SheetColumn("Title of Photo")
    private String title_of_photo;
    @SheetColumn("Photo Credit")
    private String photo_credit;
    @SheetColumn("Added By")
    private String added_by;
    @SheetColumn("Comments")
    private String comments;
    @SheetColumn("Year")
    private String year;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    /*newer things*/

    private String cell_letter;

    private String cell_star;

    private String cell_end;

    private String cell_count;

    private String single;

    private String range;

    private String cell_range1;

    private String cell_range2;

    private String cell_range3;

    private String group1;

    private String group2;

    private String group3;


    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getAlternative_name_or_spellings() {
        return alternative_name_or_spellings;
    }

    public void setAlternative_name_or_spellings(String alternative_name_or_spellings) {
        this.alternative_name_or_spellings = alternative_name_or_spellings;
    }

    public String getState_province_or_district() {
        return state_province_or_district;
    }

    public void setState_province_or_district(String state_province_or_district) {
        this.state_province_or_district = state_province_or_district;
    }

    public String getPress_name() {
        return press_name;
    }

    public void setPress_name(String press_name) {
        this.press_name = press_name;
    }

    public String getAlternative_name_or_spelling_of_press() {
        return alternative_name_or_spelling_of_press;
    }

    public void setAlternative_name_or_spelling_of_press(String alternative_name_or_spelling_of_press) {
        this.alternative_name_or_spelling_of_press = alternative_name_or_spelling_of_press;
    }

    public String getName_of_newspaper_journal_printed() {
        return name_of_newspaper_journal_printed;
    }

    public void setName_of_newspaper_journal_printed(String name_of_newspaper_journal_printed) {
        this.name_of_newspaper_journal_printed = name_of_newspaper_journal_printed;
    }

    public String getFirst_book_printed() {
        return first_book_printed;
    }

    public void setFirst_book_printed(String first_book_printed) {
        this.first_book_printed = first_book_printed;
    }

    public String getBeginning_year() {
        return beginning_year;
    }

    public void setBeginning_year(String beginning_year) {
        this.beginning_year = beginning_year;
    }

    public String getBeginning_month() {
        return beginning_month;
    }

    public void setBeginning_month(String beginning_month) {
        this.beginning_month = beginning_month;
    }

    public String getEnding_year() {
        return ending_year;
    }

    public void setEnding_year(String ending_year) {
        this.ending_year = ending_year;
    }

    public String getEnding_month() {
        return ending_month;
    }

    public void setEnding_month(String ending_month) {
        this.ending_month = ending_month;
    }

    public String getDate_notes() {
        return date_notes;
    }

    public void setDate_notes(String date_notes) {
        this.date_notes = date_notes;
    }

    public String getProprietor_founder() {
        return proprietor_founder;
    }

    public void setProprietor_founder(String proprietor_founder) {
        this.proprietor_founder = proprietor_founder;
    }

    public String getManager_superintendent() {
        return manager_superintendent;
    }

    public void setManager_superintendent(String manager_superintendent) {
        this.manager_superintendent = manager_superintendent;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getPrinter() {
        return printer;
    }

    public void setPrinter(String printer) {
        this.printer = printer;
    }

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate_est_or_earliest_record() {
        return date_est_or_earliest_record;
    }

    public void setDate_est_or_earliest_record(String date_est_or_earliest_record) {
        this.date_est_or_earliest_record = date_est_or_earliest_record;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getStartplace() {
        return startplace;
    }

    public void setStartplace(String startplace) {

        this.startplace = startplace;
    }

    public String getEndplace() {
        return endplace;
    }

    public void setEndplace(String endplace) {
        this.endplace = endplace;
    }

    public String getPhoto_link() {
        return photo_link;
    }

    public void setPhoto_link(String photo_link) {
        this.photo_link = photo_link;
    }

    public String getTitle_of_photo() {
        return title_of_photo;
    }

    public void setTitle_of_photo(String title_of_photo) {
        this.title_of_photo = title_of_photo;
    }

    public String getPhoto_credit() {
        return photo_credit;
    }

    public void setPhoto_credit(String photo_credit) {
        this.photo_credit = photo_credit;
    }

    public String getAdded_by() {
        return added_by;
    }

    public void setAdded_by(String added_by) {
        this.added_by = added_by;
    }

    public String getCell_letter() {
        return cell_letter;
    }

    public void setCell_letter(String cell_letter) {
        this.cell_letter = cell_letter;
    }

    public String getCell_star() {
        return cell_star;
    }

    public void setCell_star(String cell_star) {
        this.cell_star = cell_star;
    }

    public String getCell_end() {
        return cell_end;
    }

    public void setCell_end(String cell_end) {
        this.cell_end = cell_end;
    }

    public String getCell_count() {
        return cell_count;
    }

    public void setCell_count(String cell_count) {
        this.cell_count = cell_count;
    }

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getCell_range1() {
        return cell_range1;
    }

    public void setCell_range1(String cell_range1) {
        this.cell_range1 = cell_range1;
    }

    public String getCell_range2() {
        return cell_range2;
    }

    public void setCell_range2(String cell_range2) {
        this.cell_range2 = cell_range2;
    }

    public String getCell_range3() {
        return cell_range3;
    }

    public void setCell_range3(String cell_range3) {
        this.cell_range3 = cell_range3;
    }

    public String getGroup1() {
        return group1;
    }

    public void setGroup1(String group1) {
        this.group1 = group1;
    }

    public String getGroup2() {
        return group2;
    }

    public void setGroup2(String group2) {
        this.group2 = group2;
    }

    public String getGroup3() {
        return group3;
    }

    public void setGroup3(String group3) {
        this.group3 = group3;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }



}
