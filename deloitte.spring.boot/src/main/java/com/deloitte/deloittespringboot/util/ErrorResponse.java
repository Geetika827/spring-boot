package com.deloitte.deloittespringboot.util;

import java.util.Date;

public class ErrorResponse {
            
	    Date timestamp;
	    String message;
	    String description;
	    
	    
	    
	    public ErrorResponse() {
			// TODO Auto-generated constructor stub
		}



		public ErrorResponse(Date timestamp, String message, String description) {
			super();
			this.timestamp = timestamp;
			this.message = message;
			this.description = description;
		}



		public Date getTimestamp() {
			return timestamp;
		}



		public void setTimestamp(Date timestamp) {
			this.timestamp = timestamp;
		}



		public String getMessage() {
			return message;
		}



		public void setMessage(String message) {
			this.message = message;
		}



		public String getDescription() {
			return description;
		}



		public void setDescription(String description) {
			this.description = description;
		}
	    
	    
}
