package eu.jpereira.trainings.designpatterns.creational.factorymethod;

public class JSONReportFactory implements ReportFactory {

	ReportData data;

	public JSONReportFactory(ReportData data) {
		this.data = data;
		createReport();
	}


	@Override
	public Report createReport() {
		return new JSONReport(data);
	}

}
