public abstract class Person {
    private String name;
    private String surname;
    private String patronymic;
    private String age;
    private String sex;
    private String birthday;

    public void showPerson(){
        System.out.println(name + " " + surname + " " + patronymic + " ");
        System.out.println(age + " " + sex + " " + birthday + " ");
    }

    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }
    public void setAge(String age){
        this.age = age;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
}