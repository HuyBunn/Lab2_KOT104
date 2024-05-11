package com.example.lab2

fun main(){
    val xe1 = XeHoi("Xe 1",1000f)
    val xe2 = XeHoi("Xe 2",1500f,1996)
    xe1.tenXe +=" Ten xe moi"
    println(xe1.hienThiThongTinXe());
    println(xe2.hienThiThongTinXe())

    val tenSV :String? = "Phạm Quang Huy"
    getMSSV(tenSV!!)
}

fun getMSSV(tenSV: String){
    if(tenSV == null){
        println("Tên sv k đc null")
    }else {
        println("Ten sv: $tenSV")
    }
}
class XeHoi (var tenXe :String,var giaXe: Float){
    var namSX :Int? = 0
    constructor( tenXe: String, giaXe: Float,namSX: Int): this(tenXe,giaXe){
        this.namSX = namSX
    }
    fun hienThiThongTinXe(): String{
        if(namSX == 0){
            return "Tên Xe: $tenXe , Giá Xe: $giaXe"
        }else{
            return "Tên Xe: $tenXe , Giá Xe: $giaXe , Năm SX: $namSX"
        }
    }
}