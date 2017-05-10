package structure.model;

/**
 * @author Grayson Corbett
 */
public class Item {
private Integer intData = 0;
private String stringData = "";
private Boolean booleanData = false;

public Item()
{
}

public Item(Integer intData)
{
	this.intData = intData;
}

public Item(String stringData)
{
	this.stringData = stringData;
}

public Item(Boolean booleanData)
{
	this.booleanData = booleanData;
}

public Item(Integer intData, String stringData)
{
	this.intData = intData;
	this.stringData = stringData;
}

public Item(String stringData, Boolean booleanData)
{
	this.stringData = stringData;
	this.booleanData = booleanData;
}

public Item(Integer intData, Boolean booleanData)
{
	this.intData = intData;
	this.booleanData = booleanData;
}

public Item(Integer intData, String stringData, Boolean booleanData)
{
	this.intData = intData;
	this.stringData = stringData;
	this.booleanData = booleanData;
}

/**
 * @return the intData
 */
public Integer getIntData() {
	return intData;
}

/**
 * @param intData the intData to set
 */
public void setIntData(Integer intData) {
	this.intData = intData;
}

public void setIntData(int intData) {
	this.intData = intData;
}
/**
 * @return the stringData
 */
public String getStringData() {
	return stringData;
}
/**
 * @param stringData the stringData to set
 */
public void setStringData(String stringData) {
	this.stringData = stringData;
}
/**
 * @return the booleanData
 */
public Boolean getBooleanData() {
	return booleanData;
}
/**
 * @param booleanData the booleanData to set
 */
public void setBooleanData(Boolean booleanData) {
	this.booleanData = booleanData;
}

}
