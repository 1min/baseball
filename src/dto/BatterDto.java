package dto;

public class BatterDto extends HumanDto {
	private String position;
	private int batCount;
	private int hit;
	private double hitAvg;
	
	public BatterDto() {
	}

	public BatterDto(int number, String name, int age, double height, String position, int batCount, int hit, double hitAvg) {
		super(number, name, age, height);
		this.position = position;
		this.batCount = batCount;
		this.hit = hit;
		this.hitAvg = hitAvg;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getBatCount() {
		return batCount;
	}

	public void setBatCount(int batCount) {
		this.batCount = batCount;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public double getHitAvg() {
		return hitAvg;
	}

	public void setHitAvg(double hitAvg) {
		this.hitAvg = hitAvg;
	}

	@Override
	public String toString() { // 파일저장에 사용예정
		return super.toString() +"-" + position + "-" + batCount + "-" + hit + "-" + hitAvg;
	}
	
	@Override
	public String info() {
		// TODO Auto-generated method stub
		return super.info() + " 포지션" + position + " 타수:" + batCount + " 안타수:" + hit + " 타율:" + hitAvg;  
	}
}
