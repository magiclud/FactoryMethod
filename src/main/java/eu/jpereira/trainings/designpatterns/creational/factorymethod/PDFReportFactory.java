package eu.jpereira.trainings.designpatterns.creational.factorymethod;

public class PDFReportFactory implements ReportFactory {

	ReportData data;

	public PDFReportFactory(ReportData data) {
		this.data = data;
		createReport();
	}


	@Override
	public Report createReport() {
		return new PDFReport(data);
	}

	

}
