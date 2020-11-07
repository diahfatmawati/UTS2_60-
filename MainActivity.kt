package com.example.uts1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        listRecyclerView.layoutManager = LinearLayoutManager(this)
        listRecyclerView.setHasFixedSize(true)
        listRecyclerView.adapter = AdapterFakultas(data, { onItem: DataFakultas -> onItemClicked(onItem) })
    }
    private fun onItemClicked(onItem: DataFakultas) {
        val showDetailActivityIntent = Intent(this, DetailFakultas::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgFak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nameFak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.descFak)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.descDet)
        showDetailActivityIntent.putExtra(Intent.ACTION_PICK, onItem.webF)
        showDetailActivityIntent.putExtra(Intent.ACTION_CALL, onItem.emailF)
        startActivity(showDetailActivityIntent)
    }
    private fun createFac(): List<DataFakultas> {
        val List = ArrayList<DataFakultas>()
        List.add(
            DataFakultas(
                R.drawable.fik,
                "Fakultas Ilmu Komputer",
                "Fakultas Ilmu Komputer merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang terdiri dari program studi :",
                "\t\t\t 1. \t Teknik Informatika\n" +
                        "\t\t\t 2. \t Sistem Informasi\n\n" +
                        "Link website Fakultas Ilmu Komputer, UPN \"Veteran\" Jawa Timur",
                "https://fik.upnjatim.ac.id",
                ""
            )
        )
        List.add(
            DataFakultas(
                R.drawable.ft,
                "Fakultas Teknik",
                "Fakultas Teknik merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang terdiri dari program studi :",
                "\t\t\t 1. \t Teknik Kimia\n" +
                        "\t\t\t 2. \t Teknik Industri\n" +
                        "\t\t\t 3. \t Teknik Sipil\n" +
                        "\t\t\t 4. \t Teknik Lingkungan\n" +
                        "\t\t\t 5. \t Teknologi Pangan\n\n" +
                        "Link website Fakultas Teknik, UPN \"Veteran\" Jawa Timur",
                "https://ft.upnjatim.ac.id",
                ""
            )
        )
        List.add(
            DataFakultas(
                R.drawable.feb,
                "Fakultas Ekonomi dan Bisnis",
                "Fakultas Ekonomi dan Bisnis merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang terdiri dari program studi :",
                "\t\t\t 1. \t Ekonomi Pembangunan\n" +
                        "\t\t\t 2. \t Akuntansi\n" +
                        "\t\t\t 3. \t Manajemen\n\n" +
                        "Link website Fakultas Ekonomi dan Bisnis, UPN \"Veteran\" Jawa Timur",
                "https://febis.upnjatim.ac.id",
                ""
            )
        )
        List.add(
            DataFakultas(
                R.drawable.fp,
                "Fakultas Pertanian",
                "Fakultas Pertanian merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang terdiri dari program studi :",
                "\t\t\t 1. \t Agroteknologi\n" +
                        "\t\t\t 2. \t Agribisnis\n\n" +
                        "Link website Fakultas Pertanian, UPN \"Veteran\" Jawa Timur",
                "https://faperta.upnjatim.ac.id",
                ""
            )
        )
        List.add(
            DataFakultas(
                R.drawable.fisip,
                "Fakultas Ilmu Sosial dan Ilmu Politik",
                "Fakultas Ilmu Sosial dan Ilmu Politik  merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang terdiri dari program studi :",
                "\t\t\t 1. \t Ilmu Komunikasi\n" +
                        "\t\t\t 2. \t Ilmu Administrasi Bisnis \n"+
                        "\t\t\t 3. \t Ilmu Administrasi Negara \n"+
                        "\t\t\t 4. \t Hubungan Internasional\n\n" +
                        "Link website Fakultas Ilmu Sosial dan Ilmu Politik, UPN \"Veteran\" Jawa Timur",
                "https://fisip.upnjatim.ac.id",
                ""
            )
        )
        List.add(
            DataFakultas(
                R.drawable.fad,
                "Fakultas Arsitektur dan Desain",
                "Fakultas Arsitektur dan Desain  merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang terdiri dari program studi :",
                "\t\t\t 1. \t Teknik Arsitektur \n" +
                        "\t\t\t 2. \t Desain Komunikasi Visual\n\n" +
                        "Link website Fakultas Arsitektur dan Desain, UPN \"Veteran\" Jawa Timur",
                "https://fad.upnjatim.ac.id",
                ""
            )
        )
        List.add(
            DataFakultas(
                R.drawable.fh,
                "Fakultas Hukum",
                "Fakultas Hukum merupakan salah satu dari 7 Fakultas di UPN \"Veteran\" Jawa Timur. Yang hanya terdapat satu program studi yaitu ",
                "\t\t\t 1. \t\t Ilmu Hukum \n\n" +
                        "Link website Fakultas Hukum, UPN \"Veteran\" Jawa Timur",
                "https://fhukum.upnjatim.ac.id",
                ""
            )
        )
        List.add(
            DataFakultas(
                R.drawable.diah,
                "Diah's Profile",
                "Nama \t : Diah Fatmawati\n"+
                        "TTL \t\t : Surabaya, 19 Juli 2000\n" +
                        "Alamat : Surabaya, Jawa Timur\n" +
                        "No. HP : 083857667563\n" +
                        "Email \t : fadiahachmad@gmail.com\n" +
                        "Github : https://github.com/diahfatmawati\n",
                "Riwayat Pendidikan : \n" +
                        "\t\t 1. TK Baitusalam \n" +
                        "\t\t 2. SDN Manukan Kulon 6 \n" +
                        "\t\t 3. SMPN 33 Surabaya \n" +
                        "\t\t 4. SMA SHAFTA Surabaya \n\n" +
                        "Penghargaan : \n" +
                        "\t\t 1. Juara 3 Membuat dan Baca Puisi \n" +
                        "\t\t 2. Juara 3 Menulis CERPEN \n" +
                        "\t\t 3. 10 Besar CYS kategori Enviromental se-JATIM\n\n",
                "",
                "fadiahachmad@gmail.com"
            )
        )
        return List
    }
}