import java.util.LinkedList;

public class TennisStatistics extends LinkedList<StatScore> {
//extends a linked list to show the object of StatScore
	int numberOfEntries = 0;

	public void insertAndIncrement(StatScore s) {
		numberOfEntries ++;
//the number of Entries will increase by one
		for (int index = 0; index < this.size(); index++) {
//when the index is less than the size of the linked list, run the for loop
			if (this.get(index).HasSameScore(s)){
//if the element at index has the same score as the StatScore, add one to the count
				s.count= this.get(index).count+1;
				this.set(index, s);
				return;
			}
		}
		this.addLast(s);
		//add StatScore as the last element of the TennisStatistics
	}

}
