package groovy.samples.range
class TrainStation implements Comparable<TrainStation> {
	TrainStation next
	TrainStation previous
	String city
	String state
	long distanceFromFort

	public TrainStation(String city,String state,long distanceFromFort) {
		this.city=city
		this.state=state
		this.distanceFromFort=distanceFromFort
	}

	@Override
	int compareTo(TrainStation ts) {
		this.distanceFromFort <=> ts.getDistanceFromFort()
	}
	void setDistanceFromFort(long distanceFromFort) {
		this.distanceFromFort=distanceFromFort;
	}
	long getDistanceFromFort() {
		this.distanceFromFort
	}
	TrainStation next(){
		next
	}

	TrainStation previous(){
		previous
	}

	String toString() {

		"$city,$state  (${distanceFromFort})"
	}
}