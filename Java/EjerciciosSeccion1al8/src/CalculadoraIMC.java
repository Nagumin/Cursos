        //Ejercicio 3: Calculadora de IMC (Índice de Masa Corporal)
        //Tema: Variables, Entrada de datos por consola, Operadores.
        //Requerimiento: El programa calculará el Índice de Masa Corporal (IMC) de una persona.
        //
        //El usuario debe ingresar su peso en kilogramos y su altura en metros.
        //El programa debe calcular el IMC usando la fórmula: IMC = peso/altura^2
        //Dependiendo del resultado, debe imprimir en qué categoría de IMC se encuentra la persona: bajo peso, peso normal, sobrepeso u obesidad.

        /*Clasificación de IMC:
        Bajo peso: IMC < 18.5
        Peso normal: IMC entre 18.5 y 24.9
        Sobrepeso: IMC entre 25.0 y 29.9
        Obesidad grado 1 (Moderada): IMC entre 30.0 y 34.9
        Obesidad grado 2 (Severa): IMC entre 35.0 y 39.9
        Obesidad grado 3 (Mórbida): IMC ≥ 40.0 */

        import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

        public class CalculadoraIMC extends JFrame {
            private final JTextField pesoField;
            private final JTextField alturaField;
            private final JLabel resultadoLabel;

            public CalculadoraIMC() {
                // Configuración de la ventana (JFrame)
                setTitle("Calculadora de IMC");
                setSize(400, 300);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLayout(null);  // Layout manual

                // Etiqueta para el peso
                JLabel pesoLabel = new JLabel("Peso (kg):");
                pesoLabel.setBounds(30, 30, 100, 30);
                add(pesoLabel);

                // Campo de texto para ingresar el peso
                pesoField = new JTextField();
                pesoField.setBounds(140, 30, 200, 30);
                add(pesoField);

                // Etiqueta para la altura
                JLabel alturaLabel = new JLabel("Altura (m):");
                alturaLabel.setBounds(30, 80, 100, 30);
                add(alturaLabel);

                // Campo de texto para ingresar la altura
                alturaField = new JTextField();
                alturaField.setBounds(140, 80, 200, 30);
                add(alturaField);

                // Botón para calcular el IMC
                JButton calcularButton = new JButton("Calcular IMC");
                calcularButton.setBounds(140, 130, 200, 30);
                add(calcularButton);

                // Etiqueta para mostrar el resultado del IMC
                resultadoLabel = new JLabel("");
                resultadoLabel.setBounds(30, 180, 350, 50);
                add(resultadoLabel);

                // Acción del botón
                calcularButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        calcularIMC();
                    }
                });
            }

            // Método para calcular el IMC
            private void calcularIMC() {
                try {
                    double peso = Double.parseDouble(pesoField.getText());
                    double altura = Double.parseDouble(alturaField.getText());

                    if (peso <= 0 || altura <= 0) {
                        resultadoLabel.setText("Por favor ingrese valores positivos.");
                        return;
                    }

                    double imc = peso / (altura * altura);
                    String clasificacion;

                    if (imc < 18.5) {
                        clasificacion = "Bajo Peso";
                    } else if (imc >= 18.5 && imc < 24.9) {
                        clasificacion = "Peso Normal";
                    } else if (imc >= 25 && imc < 29.9) {
                        clasificacion = "Sobrepeso";
                    } else if (imc >= 30 && imc < 34.9) {
                        clasificacion = "Obesidad Grado 1 (Moderada)";
                    } else if (imc >= 35 && imc < 39.9) {
                        clasificacion = "Obesidad Grado 2 (Severa)";
                    } else {
                        clasificacion = "Obesidad Grado 3 (Mórbida)";
                    }

                    resultadoLabel.setText("IMC: " + String.format("%.2f", imc) + " - " + clasificacion);
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("Error: Ingrese valores numéricos válidos.");
                }
            }

            public static void main(String[] args) {
                // Mostrar la ventana
                CalculadoraIMC ventana = new CalculadoraIMC();
                ventana.setVisible(true);
            }
        }
