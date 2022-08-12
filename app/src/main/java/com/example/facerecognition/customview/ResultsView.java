
package com.example.facerecognition.customview;

import com.example.facerecognition.tflite.SimilarityClassifier;

import java.util.List;

public interface ResultsView {
  public void setResults(final List<SimilarityClassifier.Recognition> results);
}
