package Otomat;

public enum UserType {
    TEACHER(1,"Akademisyen"), STUDENT(2,"Öğrenci");

    private final int typeId;
    private final String name;

    UserType(int typeId,String name) {
        this.typeId = typeId;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
