package racetrack

class RaceTest extends GroovyTestCase {
	
	void testInMiles() {
		def race = new Race(distance:5.0)
		assertEquals 3.107, race.inMiles()
	}

}