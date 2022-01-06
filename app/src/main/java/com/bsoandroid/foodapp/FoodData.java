package com.bsoandroid.foodapp;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class FoodData {
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Donut Kentang", "Donat (Donut) adalah sejenis cake mini ataupun kue kering dengan bentuk yang khas, yaitu berlubang di tengah seperti cincin dan berbentuk bulat jika diisi sesuatu.Donat dapat dibagi menjadi dua jenis yaitu bread doughnut dan cake doughnut.", 2500, context.getDrawable(R.drawable.donut)));
        list.add(new Food("Nasi Goreng Spesial", "Nasi goreng adalah sebuah makanan berupa nasi yang digoreng dan diaduk dalam minyak goreng, margarin, atau mentega. Biasanya ditambah kecap manis, bawang merah, bawang putih, asam jawa, lada dan bumbu-bumbu lainnya; seperti telur, ayam, dan kerupuk.", 15000, context.getDrawable(R.drawable.nasigoreng)));
        list.add(new Food("Cireng Tradisional", "Cireng adalah makanan ringan yang berasal dari daerah Sunda yang dibuat dengan cara menggoreng campuran adonan yang berbahan utama tepung kanji atau tapioka. Makanan ringan ini sangat populer di daerah Priangan, dan dijual dalam berbagai bentuk dan variasi rasa. Makanan ini cukup terkenal pada era 80-an.", 1000, context.getDrawable(R.drawable.cireng)));
        list.add(new Food("Cheesecake Belgia", "Cheese cake adalah makanan ringan yang bertekstur lembut dan identik dengan cita rasanya yang lezat, gurih dan manis. Dijamin, Anda akan ketagihan saat memakannya. Cheese cake awalnya sangat populer di negara Jepang. Dan seiring perkembangan zaman jenis kue ini mulai merambah luas dan dinikmati oleh banyak orang di berbagai negara.", 7000, context.getDrawable(R.drawable.cheesecake)));
        list.add(new Food("Kopi Toraja", "Kopi adalah minuman hasil seduhan biji kopi yang telah disangrai dan dihaluskan menjadi bubuk. Kopi merupakan salah satu komoditas di dunia yang dibudidayakan lebih dari 50 negara. Dua spesies pohon kopi yang dikenal secara umum yaitu Kopi Robusta (Coffea canephora) dan Kopi Arabika (Coffea arabica).", 5000, context.getDrawable(R.drawable.kopi_hitam)));
        return list;
    }
}
