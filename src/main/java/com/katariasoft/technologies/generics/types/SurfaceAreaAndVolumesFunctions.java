package com.katariasoft.technologies.generics.types;

import java.util.function.Function;

public class SurfaceAreaAndVolumesFunctions {

	private TriFunction<Integer, Integer, Double, Double> paintingCostCalculator = paintingCostCalculatorDef();
	private Function<Double, Double> distamperChargesCalculator = d -> d / 10;
	private TriFunction<Integer, Integer, Double, Double> finalDistemperChargesCalculator = paintingCostCalculator
			.andThen(distamperChargesCalculator);

	private TriFunction<Integer, Integer, Double, Double> paintingCostCalculatorDef() {
		return (l, b, r) -> l * b * r;
	}

	public static void main(String args[]) {
		SurfaceAreaAndVolumesFunctions functions = new SurfaceAreaAndVolumesFunctions();
		System.out.println(
				"Paint charges for 10 , 10 and 5.5 is :" + functions.paintingCostCalculator.apply(10, 10, 5.5));
		System.out.println("Distamper Charges for 10 , 10 , 5.5 is "
				+ functions.finalDistemperChargesCalculator.apply(10, 10, 5.5));
		System.out.println(TriFunction.identity().apply(5));

	}

}
