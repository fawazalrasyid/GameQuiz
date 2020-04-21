package com.fawazalrasyid.gamequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class QuestionBankBinggris extends AppCompatActivity {

    //Bank Soal
    private String textQuestions [] = {
            "1. Perhatikan kalimat-kalimat berikut!\n" +
                    "(1) Makin bernas bulir padi, makin merunduk tangkainya.\n" +
                    "(2) Makin ia berwawasan, makin ia merendahkan hati seperti merunduknya setangkai padi yang berbulir bernas.\n" +
                    "(3) Seseorang yang memiliki ilmu pengetahuan dan pendidikan tinggi akan seperti padi.\n" +
                    "(4) Begitu pula manusia yang berilmu dan berpendidikan tinggi.\n" +
                    "(5) Setangkai padi yang mulai berisi akan merunduk.\n" +
                    "Susunan kalimat-kalimat di atas yang tepat sehingga membentuk sebuah paragraf argumentatif adalah....",
            "2. Tujuan seorang penulis menggunakan tabel dalam tulisannya adalah untuk ....",
            "3. Mendengarkan kata-kata anak penggembala itu, Landorundum lalu mengaku dan berkata, “Akulah yang sebenarnya mengambil buah menggamu dan terserah kepadamu hukuman apa yang harus kujalani.”\n" +
                    "Berdarkan penggalan kutipan di atas, dapat disimpulkan bahwa watak Landorundum adalah ....",
            "4. Bentuk ringkasan masih mempertahankan adanya ....",
            "5.Sebuah karangan dibagi atas paragraf-paragraf. Dalam membentuk suatu paragraf diperlukan suatu syarat. Syarat-syarat paragraf yang baik adalah sebagai berikut, kecuali ....",
            "6. Berikut ini yang bukan merupakan penggambaran tokoh secara tidak langsung adalah ....",
            "7. Kopi bubuk olahan pabrik memang lebih memikat. Pengemasannya lebih rapi dan sangat tertutup. Adapun kopi bubuk hasil olahan tangan dikemas dalam plastik yang tidak didesain dan hanya “disegel” dengan klip staples. Dengan tampilan yang  berbeda itu, kecenderungan banyak orang lebih memilih kopi bubuk dalam kemasan yang rapi dan menarik. Padahal dari segi rasa, banyak orang berpendapat justru hasil pengolahan secara tradisional itulah yang lebih nikmat.\n" +
                    "Pernyataan yang berupa fakta terdapat pada kalimat ....",
            "8. Berikut kalimat yang merupakan sebuah opini adalah ....",
            "9. Seruling di pasir ipis merdu Antara gundukan pohon pina Tembaga menggema di dua kaki Citraan pendengaran pada penggalan puisi di atas terdapat pada kalimat ....",
            "10. Berikut merupakan kriteria puisi yang baik, kecuali ....",

    };

    // Pilihan Jawaban
    private String multipleChoice [][] = {
            {"a. (1)-(3)-(5)-(2)-(4)", "b. (2)-(4)-(3)-(5)-(1)", "c. (3)-(5)-(1)-(4)-(2)", "d. (4)-(2)-(1)-(5)-(3)"},
            {"a. menerangkan bahwa kejadian benar-benar ada", "b. membuktikan bahwa peristiwa benar-benar terjadi", "c. meyakini pendapatnya secara lebih jelas dan terperinci", "d. menggambarkan suatu keadaan sebagaimana yang benar-benar terjadi"},
            {"a. jantan", "b. sombong", "c. pengecut", "d. terus terang"},
            {"a. urutan bab dan subbab", "b. daftar isi dan sudut pandang", "c. sudut pandang dan bahasa", "d. urutan isi, sudut pandang, dan perbandingan"},
            {"a. kalimat disusun secara logis", "b. tidak boleh ada kalimat sumbang", "c. bahasa yang digunakan harus efektif dan formal", "d. kalimat-kalimatnya dibuat panjang sehingga melelahkan pembaca"},
            {"a. cara berdandan", "b. cara berpakaian", "c. pelukisan bentuk lahir", "d. pelukisan aksi tokoh lain"},
            {"a. pertama", "b. kedua", "c. ketiga", "d. keempat"},
            {"a. Pemilik rumah produksi lebih suka memakai tenaga lulusan SLTA.", "b. Soal kreativitas hanya dipermasalahkan oleh sekelompok individu.", "c. Pemirsa pada umumnya menerima apa pun yang disajikan oleh stasiun televisi.", "d. Jika kecenderungan ini berlangsung terus, sinetron nasional sulit memperoleh apresiasi dari masyarakat."},
            {"a. pertama", "b. kedua", "c. ketiga", "d. pertama dan kedua"},
            {"a. memakai ragam bahasa sastra", "b. menggunakan kata-kata konotatif", "c. penggunaan gaya bahasa parelelisme", "d. menggunakan jumlah kata yang berbeda dalam baris-barisnya"}
    };

//c,d,a,d,d,c,a,d,c,d

    //Kunci Jawaban
    private String mCorrectAnswers[] = {"c. (3)-(5)-(1)-(4)-(2)", "d. menggambarkan suatu keadaan sebagaimana yang benar-benar terjadi", "a. jantan", "d. urutan isi, sudut pandang, dan perbandingan", "d. kalimat-kalimatnya dibuat panjang sehingga melelahkan pembaca", "c. pelukisan bentuk lahir", "a. pertama", "d. Jika kecenderungan ini berlangsung terus, sinetron nasional sulit memperoleh apresiasi dari masyarakat.", "c. ketiga", "d. menggunakan jumlah kata yang berbeda dalam baris-barisnya"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}