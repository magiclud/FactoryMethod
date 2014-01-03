package eu.jpereira.trainings.designpatterns.creational.factorymethod;

public class JSONReportFactory implements ReportFactory, Report {

	@Override
	public Report createReport() {
		return new JSONReport();
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
