package com.imut.iot.ch3;

public class MyTime {
	// 默认如果不加访问修饰符，那么相当于default,不是public，也不是private
	int hour;
	int minute;
	int second;

	public MyTime() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}

	public String disaplay() {
		return "hour: " + this.hour + ", minute: " + this.minute + ", second: " + this.second;
	}

	public void addSecond(int sec) {
		this.subSecond(-1 * sec);
	}

	public void addMinute(int min) {
		this.subMinute(-1 * min);
	}

	public void addHour(int hour) {
		this.subHour(hour * -1);
	}

	public void subSecond(int sec) {
		int sub = this.second - sec;
		int subMinutes = sub / 60;
		this.subMinute(subMinutes * -1);
		this.minute = sub % 60;

		if (this.minute < 0) {
			this.minute += 60;
			this.subMinute(1);
		}
	}

	public void subMinute(int min) {
		int sub = this.minute - min;
		int subHours = sub / 60;
		this.subHour(subHours * -1);
		this.minute = sub % 60;

		if (this.minute < 0) {
			this.minute += 60;
			this.subHour(1);
		}
	}

	public void subHour(int hour) {
		this.hour -= hour;
		this.hour = this.hour % 24;
		if (this.hour < 0) {
			this.hour = this.hour + 24;
		}
	}

}
