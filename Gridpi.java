public class Gridpi {
    private int gaps, totalPts, targetPts;

    public Gridpi(int gaps) {
        this.setGaps(gaps);
    }

    public void setGaps(int gaps) {
        this.gaps = gaps;
    }

    public void calculatePts() {
        for (double y = -1.0; y <= 1.0; y += 1.0 / this.gaps) {
            for (double x = -1.0; x <= 1.0; x += 1.0 / this.gaps) {
                this.totalPts++;
                if (Math.pow(x, 2) + Math.pow(y, 2) <= 1.0) this.targetPts++;
            }
        }
    }

    public int getTotalPts() { return this.totalPts; }

    public int getTargetPts() { return this.targetPts; }

    public double getPi() {
        this.calculatePts();
        return 4.0 * this.getTargetPts() / this.getTotalPts();
    }
}
