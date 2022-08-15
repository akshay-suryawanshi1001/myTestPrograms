package org.akshay.MapPractice;

public class TemplateDto {
	
	private Long orderId;
	
	private String testName;
	
	private Long unitId;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public Long getUnitId() {
		return unitId;
	}


	public void setUnitId(Long unitId) {
		this.unitId = unitId;
	}

	public TemplateDto(Long orderId, String testName, Long unitId) {
		super();
		this.orderId = orderId;
		this.testName = testName;
		this.unitId = unitId;
	}
	
	public TemplateDto() {}
}
