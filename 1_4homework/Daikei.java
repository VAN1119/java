public class Daikei {
	int jyoutei;
	int katei;
	int takasa;
	
	public Daikei(int jyoutei, int katei, int takasa) {
		this.jyoutei = jyoutei;
		this.katei = katei;
		this.takasa = takasa;
	}
	
	public int getMenseki() {
		int menseki = ((this.jyoutei + this.katei) * this.takasa / 2);
		return menseki;
	}
}