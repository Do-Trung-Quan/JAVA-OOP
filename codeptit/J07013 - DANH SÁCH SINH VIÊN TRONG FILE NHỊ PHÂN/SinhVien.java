package danhsachsinhvien1;

//import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private String ma;
    private String ten;
    private String lop;
    private Date ngaysinh;
    private float gpa;

    public SinhVien(int id, String ten, String lop, String ngaysinh, float gpa) {
        this.ma = String.format("B20DCCN%03d", id + 1);
        this.ten = ten;
        this.lop = lop;
        this.gpa = gpa;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.ngaysinh = sdf.parse(ngaysinh);
        } catch (ParseException e) {
            
        }
    }
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return ma + " " + ten + " " + lop + " " + sdf.format(ngaysinh) + " " + String.format("%.2f", gpa);
    }
}