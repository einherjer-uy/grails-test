package racetrack

class Registration {

	static constraints = {
		race()
		runner()
		paid()
		dateCreated()
	}

	static belongsTo = [race:Race, runner:Runner]

	Boolean paid
	Date dateCreated //Note: this is a special name

    static mapping = {
		//autoTimestamp false
	}

	def beforeInsert = {
	// your code goes here
	}
	def beforeUpdate = {
	// your code goes here
	}
	def beforeDelete = {
	// your code goes here
	}
	def onLoad = {
	// your code goes here
	}

}
