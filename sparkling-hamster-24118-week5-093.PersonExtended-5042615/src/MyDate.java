
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differneceInYears(MyDate compared) {
        int diff;
        if (!earlier(compared)) {
            diff = this.year - compared.year;
            if (this.month < compared.month) {
                return diff - 1;
            } else if (this.month == compared.month) {
                return this.day < compared.day ? diff - 1 : diff;
            }
            return diff;
        } else {
            diff = compared.year - this.year;
            if (compared.month < this.month) {
                return diff - 1;
            } else if (compared.month == this.month) {
                return compared.day < this.day ? diff - 1 : diff;
            }
            return diff;
        }
    }

  
}
