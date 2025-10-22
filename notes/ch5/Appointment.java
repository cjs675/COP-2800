import java.util.Date;

public class Appointment
{
    // will encapsulate info about an appointment
    private String startDate;

   // public Appointment()
    {
        this.startDate = "";
        this.endDate = "";
    }

    public String getStartDate() {return startDate;}
    public void setStartDate(String startDate) { this.startDate = startDate; }
    private String  endDate;
    public String getEndDate() {return endDate ;}
    public void setEndDate(String endDate) {this.endDate = endDate;}

    public int Duration()
    {
        // todo: calculate end time from start time & return
        return 60;
    }

    public Appointment()
    {
   //     this("", "", "");
    }

    public Appointment(String start, String end)
    {

        this.startDate = start;
        this.endDate = end;

    }

    // render the instance as a string
    public String toString()
    {
        // todo: render this as a string
        return "this is a meeting that starts at <blah> and ends at <blah> ....";
        // format here
    }
    // could also render as XML
    public String SerializeAsXML()
    {
        return "<appointment></appointment>";
    }

    public String SerializeAsJson()
    {
        return "{start: value, end: value, subject: value}";
    }


}
