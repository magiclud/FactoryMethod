package eu.jpereira.trainings.designpatterns.creational.factorymethod;

public class HTMLReportFactory implements ReportFactory {

	ReportData data;

	public HTMLReportFactory(ReportData data) {
		this.data = data;
		createReport();
	}

	@Override
	public Report createReport() {
		return new HTMLReport(data);
	}

}
