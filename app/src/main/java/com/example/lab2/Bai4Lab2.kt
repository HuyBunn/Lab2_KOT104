package com.example.lab2
import java.util.Scanner

data class SinhVien(
    var ten: String,
    val mssv: String,
    var diemTB: Float,
    var daTotNghiep: Boolean?,
    var tuoi: Int?
)

class QuanLySinhVien {
    private val danhSachSinhVien = mutableListOf<SinhVien>()

    fun themSinhVien() {
        var ten: String? = null
        var mssv: String? = null
        var diemTB: Float? = null
        var daTotNghiep: Boolean? = null
        var tuoi: Int? = null
        println("Nhập thông tin sinh viên mới:")
        print("Tên SV: ")
        var s = readLine()
        if (s != null) ten = s
        print("MSSV: ")
        s = readLine()
        if (s != null) mssv = s
        print("Điểm TB: ")
         s = readLine()
        if (s != null) diemTB = s.toFloat()
        print("Đã tốt nghiệp (true/false): ")
         s = readLine()
        if (s != null) daTotNghiep = s.toBoolean()
        print("Tuổi: ")
        s = readLine()
        if (s != null) tuoi = s.toInt()

        if (ten != null && mssv != null && diemTB != null && daTotNghiep != null && tuoi != null) {
            val sinhVien = SinhVien(ten, mssv, diemTB, daTotNghiep, tuoi)
            danhSachSinhVien.add(sinhVien)
            println("Đã thêm sinh viên thành công!")
        } else {
            println("Dữ liệu không hợp lệ. Không thể thêm sinh viên!")
        }
    }

    fun suaSinhVien() {
        var mssv:String?=null
        println("Nhập MSSV của sinh viên cần sửa:")
        var s = readLine()
        if (s != null) mssv = s

        var sinhVien = danhSachSinhVien.find { it.mssv == mssv }
        if (sinhVien != null) {
            println("Nhập thông tin mới cho sinh viên:")
            print("Tên SV: ")
             s = readLine()
            if (s != null) sinhVien.ten = s
            print("Điểm TB: ")
             s = readLine()
            if (s != null) sinhVien.diemTB = s.toFloat()
            print("Đã tốt nghiệp (true/false): ")
            s = readLine()
            if (s != null) sinhVien.daTotNghiep = s.toBoolean()
            print("Tuổi: ")
            s = readLine()
            if (s != null) sinhVien.tuoi = s.toInt()

            println("Đã sửa thông tin sinh viên thành công!")
        } else {
            println("Không tìm thấy sinh viên với MSSV đã nhập!")
        }
    }

    fun xoaSinhVien() {
        var mssv:String?=null
        println("Nhập MSSV của sinh viên cần xóa:")
        var s = readLine()
        if (s != null) mssv = s

        val sinhVien = danhSachSinhVien.find { it.mssv == mssv }
        if (sinhVien != null) {
            danhSachSinhVien.remove(sinhVien)
            println("Đã xóa sinh viên thành công!")
        } else {
            println("Không tìm thấy sinh viên với MSSV đã nhập!")
        }
    }

    fun xemDanhSachSinhVien() {
        if (danhSachSinhVien.isNotEmpty()) {
            println("Danh sách sinh viên:")
            for (sinhVien in danhSachSinhVien) {
                println("Tên SV: ${sinhVien.ten}")
                println("MSSV: ${sinhVien.mssv}")
                println("Điểm TB: ${sinhVien.diemTB}")
                println("Đã tốt nghiệp: ${sinhVien.daTotNghiep}")
                println("Tuổi: ${sinhVien.tuoi}")
                println("-----------------------")
            }
        } else {
            println("Danh sách sinh viên trống!")
        }
    }
}

fun main() {
    val quanLySinhVien = QuanLySinhVien()

    var choice: Int=0
    do {
        println("----- Chương Trình Quản Lý Sinh Viên -----")
        println("1. Thêm sinh viên")
        println("2. Sửa thông tin sinh viên")
        println("3. Xóa sinh viên")
        println("4. Xem danh sách sinh viên")
        println("0. Thoát chương trình")
        print("Nhập lựa chọn của bạn: ")
        val s = readLine()
        if (s != null) choice = s.toInt()
        when (choice) {
            1 -> quanLySinhVien.themSinhVien()
            2 -> quanLySinhVien.suaSinhVien()
            3 -> quanLySinhVien.xoaSinhVien()
            4 -> quanLySinhVien.xemDanhSachSinhVien()
            0 -> println("Đã thoát chương trình.")
            else -> println("Lựa chọn không hợp lệ. Vui lòng chọn lại.")
        }
    } while (choice != 0)
}