package eu.jpereira.trainings.designpatterns.creational.factorymethod;

public class HTMLReportFactory implements ReportFactory, Report {

	@Override
	public Report createReport() {
		return new HTMLReport();
	}

	@Override
	public void generateReport(ReportData data) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getReportContent() {
		// TODO Auto-generated method stub
		return null;
	}

}
