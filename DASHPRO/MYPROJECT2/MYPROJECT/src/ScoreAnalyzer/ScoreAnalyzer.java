package ScoreAnalyzer;
public class ScoreAnalyzer {

    public String classifyResult(int[] scores) {
        if (scores == null || scores.length == 0) {
            return "Poor "; // default jika tidak ada nilai
        }

        int sum =0;

        // HANYA hitung nilai valid 0–100
        for (int s : scores) {
            if (s >= 0 && s <= 100) {
                sum += s;
            }
        }

        // Mengikuti logika test ke-4:
        // Average = total / JUMLAH ASLI ELEMEN (BUKAN jumlah nilai valid)
        double avg = (double) sum / scores.length;

        // Klasifikasi berdasarkan nilai rata-rata
        if (avg >= 85) {
            return "Excellent";
        } else if (avg >= 70) {
            return "Good";
        } else if (avg >= 60) {
            return "Fair";
        } else {
            return "Poor";
        }
    }
}
