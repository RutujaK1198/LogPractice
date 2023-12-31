package Logger.LogPractice;

import com.github.jobop.anylog.spi.TransformDescriptor;

public class InsertLogAfterDescriptor implements TransformDescriptor {
	private String needInjectClassName;
	private String methodName;
	private String logCode;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getNeedInjectClassName() {
		return needInjectClassName;
	}

	public void setNeedInjectClassName(String needInjectClassName) {
		this.needInjectClassName = needInjectClassName;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getLogCode() {
		return logCode;
	}

	public void setLogCode(String logCode) {
		this.logCode = logCode;
	}

}
