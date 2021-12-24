package arraysorting;

public class Sort {
	int[] numbers;
	private ISortingAlgorithm sortStrategy;
	
	public Sort(int[] numbers, ISortingAlgorithm sortStrategy) {
		this.numbers = numbers;
		this.sortStrategy = sortStrategy;
	}
	
	public void sort() {
		this.numbers = sortStrategy.sort(numbers);
	}
	
	public void printNumbers() {
		for(int i = 0; i < this.numbers.length; i++) {
			System.out.println(this.numbers[i]);
		}
	}
}
