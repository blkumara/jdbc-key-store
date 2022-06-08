package com.ty.userkeystore.dto;

public class KeyStore {
		private int pid;
		private String comment;
		@Override
		public String toString() {
			return "KeyStore [pid=" + pid + ", comment=" + comment + ", description=" + description + ", key=" + key
					+ ", value=" + value + ", uid=" + uid + "]";
		}
		private String description;
		private String key;
		private String value;
		private int uid;
		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getComment() {
			return comment;
		}
		public void setComment(String comment) {
			this.comment = comment;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		
	
	
}
