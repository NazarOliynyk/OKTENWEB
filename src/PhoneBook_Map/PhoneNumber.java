package PhoneBook_Map;

public class PhoneNumber implements Comparable<PhoneNumber>{

    private String typeOfNumber;
    private int number;

    public PhoneNumber() {
    }

    public PhoneNumber(String typeOfNumber, int number) {
        this.typeOfNumber = typeOfNumber;
        this.number = number;
    }

    public String getTypeOfNumber() {
        return typeOfNumber;
    }

    public void setTypeOfNumber(String typeOfNumber) {
        this.typeOfNumber = typeOfNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhoneNumber that = (PhoneNumber) o;

        if (number != that.number) return false;
        return typeOfNumber != null ? typeOfNumber.equals(that.typeOfNumber) : that.typeOfNumber == null;
    }

    @Override
    public int hashCode() {
        int result = typeOfNumber != null ? typeOfNumber.hashCode() : 0;
        result = 31 * result + number;
        return result;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "typeOfNumber='" + typeOfNumber + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public int compareTo(PhoneNumber o) {
        //return 0;
        return this.getTypeOfNumber().compareTo(o.getTypeOfNumber());
    }
}
