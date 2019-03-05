# WeekDaysPicker
Very simple days picker (Arabic and English)

Arabic days picker with full day name 

![Arabic dayPicker](https://github.com/Rohyme/WeekDaysPicker/blob/master/Ar%20screenshot.jpg)

English days picker with  days abbreviation name


![English dayPicker](https://github.com/Rohyme/WeekDaysPicker/blob/master/Eng%20screenshot.jpg)

## Install

 - **Step 1.** Add the JitPack repository to your build file Add it in your root build.gradle at the end of repositories:
```css
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
- **Step 2.** Add the dependency
```css
dependencies {
	 implementation 'com.github.Rohyme:WeekDaysPicker:1.0.0'
	}

```

## Use

 - **In xml** :
	- Example
	```xml
	<com.rohyme.pickerlib.DayPicker  
	  android:id="@+id/dayPicker"  
	  android:layout_width="0dp"  
	  android:layout_height="wrap_content"  
	  app:layout_constraintTop_toTopOf="parent"  
	  app:layout_constraintStart_toStartOf="parent"  
	  app:layout_constraintEnd_toEndOf="parent"  
	  android:layout_margin="8dp"  
	  app:dp_day_text_full="false"  
	  app:dp_spaces_between_days="4dp"  
	  app:dp_selected_color="#4CAF50"  
	  app:dp_unSelected_color="#FFC107"  
	  app:dp_default_selection="true"  
	  app:dp_text_unselected_color="#000"  
	  app:dp_text_selected_color="#fff"  
	  app:dp_text_size="8sp"  
  />
	
	- Attributes
	
|Attribute|usage|value
|--|--|--|
|```dp_day_text_full```  |Show full name of the day or just abbreviation  | Boolean |
|```dp_default_selection```|default status of all days item(selected or not)|Boolean|
|```dp_spaces_between_days```|Spaces between days views|Dimension|
|```dp_selected_color```|Color of selected day view|Color|
|```dp_unSelected_color```|Color of not selected day view|Color|
|```dp_text_selected_color```|Color of selected day view text|Color|
|```dp_text_unselected_color```|Color of not selected day view text|Color|
|```dp_text_size```|The size of text of the day view|Dimension|
 

- **In Code** :
	- 

<!--stackedit_data:
eyJoaXN0b3J5IjpbLTEzNjQ3NjYwODcsLTEyNDA5Njg4MDYsMT
A4MDEzMzM1XX0=
-->