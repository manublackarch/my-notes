public enum MessageType {

	//<write your code here>
	A(Priority.HIGH), B(Priority.MEDIUM), C(Priority.LOW), D(Priority.LOW);
	
	private Priority priority;
	
	private MessageType(Priority priority){
	    this.priority = priority;
	}
	
	public Priority getPriority(){
	    return this.priority;
	}
}
