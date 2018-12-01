package com.katariasoft.technologies.generics.types;

import java.util.function.Function;

public class SurfaceAreaAndVolumesFunctions {

	private TriFunction<Integer, Integer, Double, Double> paintingCostCalculator = paintingCostCalculatorDef();
	private Function<Double, Double> distamperChargesCalculator = d -> d / 10;

	private TriFunction<Integer, Integer, Double, Double> paintingCostCalculatorDef() {
		return (l, b, r) -> l * b * r;
	}

	public TriFunction<Integer, Integer, Double, Double> getPaintingCostCalculator() {
		return paintingCostCalculator;
	}

	public static void main(String args[]) {
		SurfaceAreaAndVolumesFunctions functions = new SurfaceAreaAndVolumesFunctions();
		System.out.println(
				"Paint charges for 10 , 10 and 5.5 is :" + functions.getPaintingCostCalculator().apply(10, 10, 5.5));
		System.out.println("Distamper Charges for 10 , 10 , 5.5 is "
				+ functions.paintingCostCalculator.andThen(functions.distamperChargesCalculator).apply(10, 10, 5.5));

	}

}
