package com.example.lab2

fun main() {
    var arrX = intArrayOf(1, 2, 3, 4)
    println(arrX.asList())
    println("In ra các phần tử trong mảng X: ")
    //Cách 1
    for (x in arrX) {
        println(x)
    }
    arrX[0] = 5
    arrX[1] = 7
    arrX[arrX.size - 1] = 8

    var listX = arrX.asList().toMutableList()
    listX.add(6)
    //Cách 2
    for (i in listX.indices) {
        println("Phần tử thứ $i trong mảng X: ${listX[i]}")
    }
    //danh sach

    val listY = mutableListOf(3, 4, 5, 6)
    listY.add(0, 1);
    println("ListY: $listY");
    listY.removeAt(listY.size - 1);
    println("ListY: $listY");

    println("Nhập mã SV: ")
    var s = readLine()
    if (s != null) {
        println(getMssv(s))
    }
}

private val MAP_DSSV: Map<String, String> = mutableMapOf(
    "PH40096" to "Phạm Quang Huy",
    "PH14646" to "Lê Thế Anh",
    "PH55547" to "Nguyễn Chí Phong"
)

//cú pháp when trong kotlin (thay thế swich case)
fun getMssv(maSV: String): String? {
    when (maSV) {
        "PH14646" -> {
            return MAP_DSSV.get(maSV)
        }

        "PH40096" -> {
            return MAP_DSSV.get(maSV)
        }
        "PH55547" -> {
            return MAP_DSSV.get(maSV)
        }
    }
    return "Ko có dữ liệu"
}

class bai2 {

}