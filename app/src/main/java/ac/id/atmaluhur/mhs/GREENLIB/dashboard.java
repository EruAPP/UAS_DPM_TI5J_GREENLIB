package ac.id.atmaluhur.mhs.GREENLIB;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
    }
    public void akun (View a) {
        startActivity(new Intent (dashboard.this, Akun.class));
    }
    public void daftar_buku (View a) {
        startActivity(new Intent (dashboard.this, DaftarBuku.class));
    }
    public void kotak_saran (View a) {
        startActivity(new Intent (dashboard.this, KotakSaran.class));
    }
    public void riwayat_peminjaman (View a) {
        startActivity(new Intent (dashboard.this, RiwayatPeminjamanBuku.class));
    }
    public void riwayat_kunjungan (View a) {
        startActivity(new Intent (dashboard.this, RiwayatKunjunganPerpustakaan.class));
    }
}