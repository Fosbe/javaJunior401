package RomaWork;

import java.util.Arrays;
/**
 * Интерфейс работы с матрицами
 * 
 * @author nedis
 * @version 1.0
 */
public interface IMatrix {
	

	int DEFAULT_MATRIX_SIZE = 1;

	int getRows();

	int getColumns();

	double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException;

	void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException;

	IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException;

	IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException;

	IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException;

	IMatrix mul(double value);

	IMatrix transpose();

	void fillMatrix(double value);

	double determinant();

	boolean isNullMatrix();

	boolean isIdentityMatrix();

	boolean isSquareMatrix();

	void printToConsole();
}
