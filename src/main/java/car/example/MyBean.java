package car.example;

public class MyBean {
    private String message;
    private String message2;
    public void setMessage(String message) {
        this.message = message;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public void showMessage(){
        System.out.println("message" + message);
    }


    @Override
    public String toString() {
        return "MyBean{" +
                "message='" + message + message2 + '\'' +
                '}';
    }
}
