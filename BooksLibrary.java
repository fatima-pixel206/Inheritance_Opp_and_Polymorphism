package OPP;

public class BooksLibrary {
    String title;
    String author;
    String code;
    static double counter;
    String readerName;
    String issueDate;
    String returnDate;

    /// constructor
    public BooksLibrary(String title, String author, String code, String readerName, String issueDate, String returnDate) {
        this.title = title;
        this.author = author;
        this.code = code;
        this.readerName = readerName;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
    }


    public void setName(String readerName){
        this.readerName=readerName;

    }
    public String getName(){
        return readerName;
    }
    public void setIssueDate(String Date){
        issueDate=Date;

    }
    public void setReturnDate(String ReDate){
        issueDate=ReDate;
    }

    public String getIssueDate(){
        return issueDate;

    }

    public String getReturnDate(){
        return returnDate;

    }
    public  void setCounter(double counter){
        this.counter=counter;
    }
    public static double getCounter(){
        return counter;
    }

    public void borrowBook(String title , String author,String code, String issueDate,String returnDate ){
        this.title=title;
        this.author=author;
        this.code=code;
        setName(this.readerName);
        getCounter();
        setIssueDate(this.issueDate);
        getIssueDate();
        setReturnDate(this.returnDate);
        getReturnDate();
        System.out.println(" there are total books in library are. : "+getCounter());
        System.out.println ( "\n"+getName()+" is borrowed "+this.title+ "\n author is "+this.author+"\n book code is "+this.code+ " on dated "
                +issueDate+" and to be returned on "+returnDate);

    }
    public void returnBook(String title , String author,String code, String returnDate ){
        this.title=title;
        this.author=author;
        this.code=code;
        setName(this.readerName);
        System.out.println(readerName+" has returned "+this.title+" on dated "+returnDate);
    }
}
