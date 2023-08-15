/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Class.FileTypeFilter;
import jaco.mp3.player.MP3Player;
import Class.PlayList;
import Class.SongList;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Tharupathi
 */
public class MainForm extends javax.swing.JFrame {

    MP3Player player;
    SongList songList = new SongList();
    PlayList playList = new PlayList();

    File songFile;
    Clip clip;
    AudioInputStream audioStream;
    String currentDirectory = "home.user";
    String currentPath;

    String imagePath;

    boolean repeat = false;

    boolean windowCollapsed = false;

    int xMouse, yMouse;
    //DefaultListModel dlm=new DefaultListModel();

    public MainForm() {
        initComponents();

        tblSongs.getColumnModel().getColumn(0).setMaxWidth(0);
        lblSongsCount.setText(String.valueOf(songList.getCountOfAllSongs()) + " Songs");

        songFile = new File("D:\\Music\\SHAA FM SINDU KAMARE WITH POWER PACK & DEGREE 2019-11-08\\02 - NEW SONGS DJ STYLE NONSTOP (POWER PACK).mp3");

        String fileName = songFile.getName();

        lblPlaying.setText(fileName);

        player = mp3Player();

        player.addToPlayList(songFile);
    }

    private MP3Player mp3Player() {
        MP3Player mp3Player = new MP3Player();
        return mp3Player;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        pnlMain = new javax.swing.JPanel();
        pnlSongPLayer = new javax.swing.JPanel();
        pblNavigation = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnDeleteSelectedSong = new javax.swing.JLabel();
        btnDeleteBeg = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnDeleteEnd = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btnAddSong = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnSortAtoZ = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btnSortZtoA = new javax.swing.JLabel();
        txtSerachSong = new javax.swing.JTextField();
        cmbPlayListNames = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        pnlBtnBelow = new javax.swing.JPanel();
        lblPlaying = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JLabel();
        btnPauseLbl = new javax.swing.JLabel();
        btnNext = new javax.swing.JLabel();
        btnMute = new javax.swing.JLabel();
        btnUnMute = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnPlayLbl = new javax.swing.JLabel();
        progressBarSong = new javax.swing.JProgressBar();
        jLabel17 = new javax.swing.JLabel();
        txtPlayListName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JLabel();
        scrolPanePlayList = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSongs = new javax.swing.JTable();
        lblSongsCount = new javax.swing.JLabel();
        txtSongNameAfterSearch = new javax.swing.JLabel();
        btnUpdatePlayList = new javax.swing.JLabel();
        btnSavePlayList = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMain.setBackground(new java.awt.Color(46, 46, 46));

        pnlSongPLayer.setBackground(new java.awt.Color(27, 27, 27));

        javax.swing.GroupLayout pnlSongPLayerLayout = new javax.swing.GroupLayout(pnlSongPLayer);
        pnlSongPLayer.setLayout(pnlSongPLayerLayout);
        pnlSongPLayerLayout.setHorizontalGroup(
            pnlSongPLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlSongPLayerLayout.setVerticalGroup(
            pnlSongPLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        pblNavigation.setBackground(new java.awt.Color(27, 27, 27));

        jPanel4.setBackground(new java.awt.Color(27, 27, 27));

        jLabel1.setBackground(new java.awt.Color(27, 27, 27));
        jLabel1.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Songs");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(27, 27, 27));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-music-24.png"))); // NOI18N
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel4.setBackground(new java.awt.Color(27, 27, 27));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-playlist-24.png"))); // NOI18N
        jLabel4.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(27, 27, 27));
        jLabel3.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Playlist");
        jLabel3.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(27, 27, 27));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-remove-document-24.png"))); // NOI18N
        jLabel6.setOpaque(true);

        btnDeleteSelectedSong.setBackground(new java.awt.Color(27, 27, 27));
        btnDeleteSelectedSong.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        btnDeleteSelectedSong.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteSelectedSong.setText("Remove Selected Song ");
        btnDeleteSelectedSong.setOpaque(true);
        btnDeleteSelectedSong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteSelectedSongMouseClicked(evt);
            }
        });

        btnDeleteBeg.setBackground(new java.awt.Color(27, 27, 27));
        btnDeleteBeg.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        btnDeleteBeg.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteBeg.setText("Remove First Song ");
        btnDeleteBeg.setOpaque(true);
        btnDeleteBeg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteBegMouseClicked(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(27, 27, 27));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-remove-document-24.png"))); // NOI18N
        jLabel8.setOpaque(true);

        btnDeleteEnd.setBackground(new java.awt.Color(27, 27, 27));
        btnDeleteEnd.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        btnDeleteEnd.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteEnd.setText("Remove Last Song ");
        btnDeleteEnd.setOpaque(true);
        btnDeleteEnd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteEndMouseClicked(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(27, 27, 27));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-remove-document-24.png"))); // NOI18N
        jLabel16.setOpaque(true);

        jLabel19.setBackground(new java.awt.Color(27, 27, 27));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-plus-math-24.png"))); // NOI18N
        jLabel19.setOpaque(true);

        btnAddSong.setBackground(new java.awt.Color(27, 27, 27));
        btnAddSong.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        btnAddSong.setForeground(new java.awt.Color(255, 255, 255));
        btnAddSong.setText("Add New Song");
        btnAddSong.setOpaque(true);
        btnAddSong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddSongMouseClicked(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(27, 27, 27));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-sort-alpha-up-24.png"))); // NOI18N
        jLabel22.setOpaque(true);

        btnSortAtoZ.setBackground(new java.awt.Color(27, 27, 27));
        btnSortAtoZ.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        btnSortAtoZ.setForeground(new java.awt.Color(255, 255, 255));
        btnSortAtoZ.setText("Sort (A - Z)");
        btnSortAtoZ.setOpaque(true);
        btnSortAtoZ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSortAtoZMouseClicked(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(27, 27, 27));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-sort-alpha-up-reversed-24.png"))); // NOI18N
        jLabel24.setOpaque(true);

        btnSortZtoA.setBackground(new java.awt.Color(27, 27, 27));
        btnSortZtoA.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        btnSortZtoA.setForeground(new java.awt.Color(255, 255, 255));
        btnSortZtoA.setText("Sort (Z - A)");
        btnSortZtoA.setOpaque(true);
        btnSortZtoA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSortZtoAMouseClicked(evt);
            }
        });

        txtSerachSong.setToolTipText("Search Song\n");
        txtSerachSong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSerachSongKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSerachSongKeyReleased(evt);
            }
        });

        cmbPlayListNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlayListNamesActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Search Song");

        javax.swing.GroupLayout pblNavigationLayout = new javax.swing.GroupLayout(pblNavigation);
        pblNavigation.setLayout(pblNavigationLayout);
        pblNavigationLayout.setHorizontalGroup(
            pblNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pblNavigationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSerachSong, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pblNavigationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pblNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pblNavigationLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pblNavigationLayout.createSequentialGroup()
                        .addGroup(pblNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pblNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSortAtoZ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteSelectedSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteBeg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeleteEnd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pblNavigationLayout.createSequentialGroup()
                                .addGroup(pblNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSortZtoA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pblNavigationLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbPlayListNames, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))
                    .addGroup(pblNavigationLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pblNavigationLayout.setVerticalGroup(
            pblNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pblNavigationLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(pblNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddSong, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pblNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPlayListNames))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pblNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteSelectedSong, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pblNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteBeg, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pblNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pblNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSortAtoZ, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pblNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSortZtoA, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(3, 3, 3)
                .addComponent(txtSerachSong, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pnlBtnBelow.setBackground(new java.awt.Color(27, 27, 27));

        lblPlaying.setBackground(new java.awt.Color(255, 255, 255));
        lblPlaying.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        lblPlaying.setForeground(new java.awt.Color(255, 255, 255));
        lblPlaying.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlaying.setText("Ansathu oba | ( Official Music Video ) - Thisara Weerasinghe");

        btnPrevious.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-skip-to-start-24.png"))); // NOI18N
        btnPrevious.setMaximumSize(new java.awt.Dimension(30, 30));
        btnPrevious.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPreviousMouseClicked(evt);
            }
        });

        btnPauseLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPauseLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-pause-24.png"))); // NOI18N
        btnPauseLbl.setMaximumSize(new java.awt.Dimension(30, 30));
        btnPauseLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPauseLblMouseClicked(evt);
            }
        });

        btnNext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-end-24.png"))); // NOI18N
        btnNext.setMaximumSize(new java.awt.Dimension(30, 30));
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
        });

        btnMute.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-no-audio-24.png"))); // NOI18N
        btnMute.setMaximumSize(new java.awt.Dimension(30, 30));
        btnMute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMuteMouseClicked(evt);
            }
        });

        btnUnMute.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUnMute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-audio-24.png"))); // NOI18N
        btnUnMute.setMaximumSize(new java.awt.Dimension(30, 30));
        btnUnMute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUnMuteMouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("03.59");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("00:00");

        btnPlayLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPlayLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-play-24.png"))); // NOI18N
        btnPlayLbl.setMaximumSize(new java.awt.Dimension(30, 30));
        btnPlayLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlayLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlBtnBelowLayout = new javax.swing.GroupLayout(pnlBtnBelow);
        pnlBtnBelow.setLayout(pnlBtnBelowLayout);
        pnlBtnBelowLayout.setHorizontalGroup(
            pnlBtnBelowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBtnBelowLayout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel26)
                .addGroup(pnlBtnBelowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBtnBelowLayout.createSequentialGroup()
                        .addGroup(pnlBtnBelowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(pnlBtnBelowLayout.createSequentialGroup()
                                .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btnPlayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btnPauseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPlaying, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(142, 142, 142)
                        .addComponent(btnMute, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUnMute, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBtnBelowLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(progressBarSong, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel21)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBtnBelowLayout.setVerticalGroup(
            pnlBtnBelowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBtnBelowLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblPlaying)
                .addGap(13, 13, 13)
                .addGroup(pnlBtnBelowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel21)
                    .addComponent(progressBarSong, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBtnBelowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPauseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUnMute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Add PlayList :");

        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText(" Search ");
        btnSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });

        tblSongs.setBackground(new java.awt.Color(27, 27, 27));
        tblSongs.setFont(new java.awt.Font("Poppins Medium", 1, 18)); // NOI18N
        tblSongs.setForeground(new java.awt.Color(255, 255, 255));
        tblSongs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "File Path", "Song Title"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSongs.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblSongs.setGridColor(new java.awt.Color(27, 27, 27));
        tblSongs.setRowHeight(35);
        tblSongs.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tblSongs.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tblSongs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSongsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSongs);

        lblSongsCount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSongsCount.setForeground(new java.awt.Color(255, 255, 255));
        lblSongsCount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtSongNameAfterSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtSongNameAfterSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtSongNameAfterSearch.setText(".");

        btnUpdatePlayList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdatePlayList.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdatePlayList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUpdatePlayList.setText("Update PlayList");
        btnUpdatePlayList.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnUpdatePlayList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdatePlayListMouseClicked(evt);
            }
        });

        btnSavePlayList.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSavePlayList.setForeground(new java.awt.Color(255, 255, 255));
        btnSavePlayList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSavePlayList.setText("Save Playlist");
        btnSavePlayList.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnSavePlayList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSavePlayListMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(pnlSongPLayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBtnBelow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMainLayout.createSequentialGroup()
                .addComponent(pblNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPlayListName, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch)
                        .addGap(18, 18, 18)
                        .addComponent(btnSavePlayList, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdatePlayList, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblSongsCount, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSongNameAfterSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(scrolPanePlayList, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlSongPLayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlayListName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(btnSearch)
                                    .addComponent(lblSongsCount)
                                    .addComponent(txtSongNameAfterSearch)
                                    .addComponent(btnUpdatePlayList)
                                    .addComponent(btnSavePlayList))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrolPanePlayList, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pblNavigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBtnBelow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddSongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddSongMouseClicked
        tblSongs.getSelectionModel().clearSelection();
        //tblSongs.removeRowSelectionInterval(0,tblSongs.getRowCount()-1);
        JFileChooser openFileChooser = new JFileChooser(currentDirectory);
        openFileChooser.setFileFilter(new FileTypeFilter(".mp3", "Open MP3 Files Only!"));
        int result = openFileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            songFile = openFileChooser.getSelectedFile();
            //add song to table
            DefaultTableModel model = (DefaultTableModel) tblSongs.getModel();
            Object[] data = {songFile, songFile.getName()};
            model.addRow(data);
            System.out.println("Row Count :" + model.getRowCount());

            tblSongs.setRowSelectionInterval(tblSongs.getRowCount() - 1, tblSongs.getRowCount() - 1);
            //add to linked list song path

            songList.insertLast(songFile, songFile.getName());
            //add song to playList
            player.addToPlayList(songList.getSong());
            player.skipForward();
            currentDirectory = songFile.getAbsolutePath();
            lblPlaying.setText(songFile.getName());
        }
    }//GEN-LAST:event_btnAddSongMouseClicked

    private void btnPauseLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPauseLblMouseClicked
        player.pause();
    }//GEN-LAST:event_btnPauseLblMouseClicked

    private void tblSongsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSongsMouseClicked
        int row = tblSongs.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel) tblSongs.getModel();

        songFile = (File) dtm.getValueAt(row, 0);
        player.addToPlayList(songFile);

        player.skipForward();
        currentDirectory = songFile.getAbsolutePath();
        lblPlaying.setText(songFile.getName());
    }//GEN-LAST:event_tblSongsMouseClicked

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
        int row = tblSongs.getSelectedRow();
        System.out.println("Selected Row After Next Button : " + row);
        DefaultTableModel dtm = (DefaultTableModel) tblSongs.getModel();
        File currentSongPath = (File) dtm.getValueAt(row, 0);

        //File currentSongPath=(File)lblPlaying.getText();
        //System.out.println("Path test :"+currentSongPath);
        System.out.println("Current Song path :" + currentSongPath);

        File nextSongpath = songList.playNextSong(currentSongPath);

        if (nextSongpath != null) {
            player.addToPlayList(nextSongpath);

            player.skipForward();
            currentDirectory = songFile.getAbsolutePath();
            lblPlaying.setText(nextSongpath.getName());
            if (tblSongs.getRowCount() - 1 != row) {
                tblSongs.setRowSelectionInterval(row + 1, row + 1);
            } else {
                tblSongs.setRowSelectionInterval(0, 0);
            }

        } else {
            System.out.println("Next Song is null");
        }
    }//GEN-LAST:event_btnNextMouseClicked

    private void btnPreviousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPreviousMouseClicked
        int row = tblSongs.getSelectedRow();

        DefaultTableModel dtm = (DefaultTableModel) tblSongs.getModel();
        File currentSongPath = (File) dtm.getValueAt(row, 0);

        //File currentSongPath=(File)lblPlaying.getText();
        //System.out.println("Path test :"+currentSongPath);
        System.out.println("Current Song path :" + currentSongPath);

        File previousSongpath = songList.playPreviousSong(currentSongPath);
        //System.out.println("Previous Song path :"+previousSongpath); 

        if (previousSongpath != null) {
            player.addToPlayList(previousSongpath);

            player.skipForward();
            currentDirectory = songFile.getAbsolutePath();
            lblPlaying.setText(previousSongpath.getName());
            if (row - 1 != -1) {
                tblSongs.setRowSelectionInterval(row - 1, row - 1);
            } else if (row - 1 == -1) {
                tblSongs.setRowSelectionInterval(tblSongs.getRowCount() - 1, tblSongs.getRowCount() - 1);
            }

        } else {
            System.out.println("No Previous Song Song is null");
        }
    }//GEN-LAST:event_btnPreviousMouseClicked

    private void btnDeleteBegMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteBegMouseClicked
        int result = songList.deleteFromBegining();
        int selectedRow = tblSongs.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblSongs.getModel();

        if (result == 1) {
            model.removeRow(0);
            JOptionPane.showMessageDialog(this, "Done");
            if (selectedRow - 1 == -1) {
                player.stop();
                // lblPlaying.setText("No Songs To Play");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Fail");
        }
    }//GEN-LAST:event_btnDeleteBegMouseClicked

    private void btnDeleteEndMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteEndMouseClicked
        int result = songList.deleteFromEnd();
        int selectedRow = tblSongs.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblSongs.getModel();

        if (result == 1) {

            model.removeRow(tblSongs.getRowCount() - 1);
            if (selectedRow - 1 != -1) {
                tblSongs.setRowSelectionInterval(tblSongs.getRowCount() - 1, tblSongs.getRowCount() - 1);
                songFile = (File) model.getValueAt(tblSongs.getSelectedRow(), 0);
                player.addToPlayList(songFile);

                player.skipForward();
                currentDirectory = songFile.getAbsolutePath();
                lblPlaying.setText(songFile.getName());
            } else {
                player.stop();
                //lblPlaying.setText("No Songs To Play");
            }
            JOptionPane.showMessageDialog(this, "Done");

        } else {
            JOptionPane.showMessageDialog(this, "Fail");
        }
    }//GEN-LAST:event_btnDeleteEndMouseClicked

    private void btnDeleteSelectedSongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteSelectedSongMouseClicked
        int row = tblSongs.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel) tblSongs.getModel();
        File songPathToDelete = (File) dtm.getValueAt(row, 0);
        int val = songList.deleteSongToGivenSongPath(songPathToDelete);
        if (val == 1) {
            dtm.removeRow(row);
            System.out.print("Done");
            if (row - 1 != -1) {
                tblSongs.setRowSelectionInterval(0, 0);

            }
            player.stop();
        } else {
            System.out.print("Error");
        }
    }//GEN-LAST:event_btnDeleteSelectedSongMouseClicked

    public void removeRows() {
        DefaultTableModel dm = (DefaultTableModel) tblSongs.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }

    private void btnSortAtoZMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSortAtoZMouseClicked
        removeRows();
        songList.sort(0);

        File[] sortedSongList = songList.getSortedSongListPath();
        String[] sortedSongName = songList.getSortedSongListName();
        for (int i = 0; i < sortedSongName.length; i++) {
            DefaultTableModel model = (DefaultTableModel) tblSongs.getModel();
            Object[] data = {sortedSongList[i], sortedSongName[i]};
            model.addRow(data);
            System.out.println("Sorted Song List :" + sortedSongName[i]);
            tblSongs.setRowSelectionInterval(0, 0);
        }
        //songList.display();
    }//GEN-LAST:event_btnSortAtoZMouseClicked

    private void btnSortZtoAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSortZtoAMouseClicked
        removeRows();
        songList.sort(1);

        File[] sortedSongList = songList.getSortedSongListPath();
        String[] sortedSongName = songList.getSortedSongListName();
        for (int i = 0; i < sortedSongName.length; i++) {
            DefaultTableModel model = (DefaultTableModel) tblSongs.getModel();
            Object[] data = {sortedSongList[i], sortedSongName[i]};
            model.addRow(data);
            System.out.println("Sorted Song List :" + sortedSongName[i]);
            tblSongs.setRowSelectionInterval(0, 0);
        }
    }//GEN-LAST:event_btnSortZtoAMouseClicked

    private void cmbPlayListNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlayListNamesActionPerformed
        songList.deleteAllSongs();
        txtSongNameAfterSearch.setText(cmbPlayListNames.getSelectedItem().toString());
        removeRows();
        File[] songPathforSelectedPlayList = playList.getPlayListSongPaths(txtSongNameAfterSearch.getText());
        String[] songNamesForSelectedPlayList = playList.getPlayListSongNames(txtSongNameAfterSearch.getText());
        for (int i = 0; i < songPathforSelectedPlayList.length; i++) {
            //System.out.println("Songs from Selected Play List"+songNamesForSelectedPlayList[i]);
            DefaultTableModel model = (DefaultTableModel) tblSongs.getModel();
            Object[] data = {songPathforSelectedPlayList[i], songNamesForSelectedPlayList[i]};
            model.addRow(data);
            //songListTest.
            songList.insertLast(songPathforSelectedPlayList[i], songNamesForSelectedPlayList[i]);
            //System.out.println("Sorted Song List :"+sortedSongName[i]);
            tblSongs.setRowSelectionInterval(0, 0);
            
        }
        diplaySongCount();
    }//GEN-LAST:event_cmbPlayListNamesActionPerformed

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        if (txtPlayListName.getText() != null) {
            removeRows();
            File[] songPathforSelectedPlayList = playList.getPlayListSongPaths(txtPlayListName.getText());
            String[] songNamesForSelectedPlayList = playList.getPlayListSongNames(txtPlayListName.getText());
            for (int i = 0; i < songPathforSelectedPlayList.length; i++) {
                //System.out.println("Songs from Selected Play List"+songNamesForSelectedPlayList[i]);
                DefaultTableModel model = (DefaultTableModel) tblSongs.getModel();
                Object[] data = {songPathforSelectedPlayList[i], songNamesForSelectedPlayList[i]};
                model.addRow(data);
                //System.out.println("Sorted Song List :"+sortedSongName[i]);
                tblSongs.setRowSelectionInterval(0, 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Search Playlist Name is Empty");
        }
    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnSavePlayListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSavePlayListMouseClicked
        String playListName = txtPlayListName.getText();
        //File[] songPath=songList.getSortedSongListPath();
        //String[] songName=songList.getSortedSongListName();
        //Object[] rowData = new Object[tblSongs.getColumnCount()];
        DefaultTableModel dtm = (DefaultTableModel) tblSongs.getModel();
        File[] songPath = new File[dtm.getRowCount()];
        String[] songName = new String[dtm.getRowCount()];
        for (int i = 0; i < dtm.getRowCount(); i++) {
            System.out.println("Done");
            songPath[i] = (File) dtm.getValueAt(i, 0);
            songName[i] = dtm.getValueAt(i, 1).toString();
        }
        //File[] songPath=(File)rowData;
        playList.insertEnd(playListName, songPath, songName, tblSongs.getRowCount());
        playList.print();

        //add existing playListValues to Combo box
        String playListNameList[] = playList.getAllPlayListNames();
        //cmbPlayListNames.setSelectedIndex(0);
        cmbPlayListNames.setModel(new DefaultComboBoxModel(playListNameList));
    }//GEN-LAST:event_btnSavePlayListMouseClicked

    private void btnPlayLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayLblMouseClicked
        player.play();
    }//GEN-LAST:event_btnPlayLblMouseClicked

    private void btnUpdatePlayListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdatePlayListMouseClicked
        String playListName=txtSongNameAfterSearch.getText();
        DefaultTableModel dtm = (DefaultTableModel) tblSongs.getModel();
        File[] songPath = new File[dtm.getRowCount()];
        String[] songName = new String[dtm.getRowCount()];
        for (int i = 0; i < dtm.getRowCount(); i++) {
            System.out.println("Done");
            songPath[i] = (File) dtm.getValueAt(i, 0);
            songName[i] = dtm.getValueAt(i, 1).toString();
        }
        //File[] songPath=(File)rowData;
        playList.updatePlayList(playListName, songPath, songName);
        //playList.print();

        //add existing playListValues to Combo box
        String playListNameList[] = playList.getAllPlayListNames();

        String[] cleanedArray = Arrays.stream(playListNameList).filter(Objects::nonNull).toArray(String[]::new);
        //cmbPlayListNames.setSelectedIndex(0);

        cmbPlayListNames.setModel(new DefaultComboBoxModel(cleanedArray));
    }//GEN-LAST:event_btnUpdatePlayListMouseClicked

    private void btnMuteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMuteMouseClicked
        volumeController(0.0);
    }//GEN-LAST:event_btnMuteMouseClicked

    private void txtSerachSongKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerachSongKeyPressed
         DefaultTableModel dtm = (DefaultTableModel) tblSongs.getModel();
         TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(dtm);
         tblSongs.setRowSorter(tr);
         tr.setRowFilter(RowFilter.regexFilter(txtSerachSong.getText().trim()));
    }//GEN-LAST:event_txtSerachSongKeyPressed

    private void txtSerachSongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerachSongKeyReleased
         DefaultTableModel dtm = (DefaultTableModel) tblSongs.getModel();
         TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(dtm);
         tblSongs.setRowSorter(tr);
         tr.setRowFilter(RowFilter.regexFilter(txtSerachSong.getText().trim()));
    }//GEN-LAST:event_txtSerachSongKeyReleased

    private void btnUnMuteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUnMuteMouseClicked
        volumeController(1.0);
    }//GEN-LAST:event_btnUnMuteMouseClicked
    public void diplaySongCount(){
         DefaultTableModel dtm = (DefaultTableModel) tblSongs.getModel();
         int numberOfSongs=dtm.getRowCount();
         lblSongsCount.setText(String.valueOf(numberOfSongs));
    }
    
    
    //////////////////////////////// Volume Control \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    
    private void volumeController(Double volumeToPlusMines){
        //get information from audio system
        Mixer.Info[] mixers=AudioSystem.getMixerInfo();
        //use for loop to list all mixers
        for(Mixer.Info mixerinfo:mixers)
        {
            Mixer mixer =AudioSystem.getMixer(mixerinfo);
            Line.Info[] lineinfos=mixer.getTargetLineInfo();
            
            for(Line.Info lineinfo:lineinfos){
                
                Line x=null;
                
                boolean opened=true;
                try{
                    x=mixer.getLine(lineinfo);
                    opened=x.isOpen()||x instanceof Clip;
                    //check line is not opend
                    if(!opened){
                        //open line
                        x.open();
                    }
                    //make a float control
                    FloatControl volumecontrol=(FloatControl)x.getControl(FloatControl.Type.VOLUME);
                    //get current volume
                    float currentVolume=volumecontrol.getValue();
                    //make a tempory variable for store value
                    Double volumeToCut=volumeToPlusMines;
                    //make a float and calculate the add or subtractin in volume
                    float y=(float) ((double)volumeToCut);
                    //set change value  in volume line
                    volumecontrol.setValue(y);
                    
                }
                catch(LineUnavailableException ex){
                }
                catch(IllegalArgumentException iex){   
                }
                finally{
                    //close line if it is opend
                    if(lineinfos!=null&&!opened)
                    {
                        x.close();
                    }
                }
   
            }
            
        }
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAddSong;
    private javax.swing.JLabel btnDeleteBeg;
    private javax.swing.JLabel btnDeleteEnd;
    private javax.swing.JLabel btnDeleteSelectedSong;
    private javax.swing.JLabel btnMute;
    private javax.swing.JLabel btnNext;
    private javax.swing.JLabel btnPauseLbl;
    private javax.swing.JLabel btnPlayLbl;
    private javax.swing.JLabel btnPrevious;
    private javax.swing.JLabel btnSavePlayList;
    private javax.swing.JLabel btnSearch;
    private javax.swing.JLabel btnSortAtoZ;
    private javax.swing.JLabel btnSortZtoA;
    private javax.swing.JLabel btnUnMute;
    private javax.swing.JLabel btnUpdatePlayList;
    private javax.swing.JComboBox<String> cmbPlayListNames;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPlaying;
    private javax.swing.JLabel lblSongsCount;
    private javax.swing.JPanel pblNavigation;
    private javax.swing.JPanel pnlBtnBelow;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlSongPLayer;
    private javax.swing.JProgressBar progressBarSong;
    private javax.swing.JScrollPane scrolPanePlayList;
    private javax.swing.JTable tblSongs;
    private javax.swing.JTextField txtPlayListName;
    private javax.swing.JTextField txtSerachSong;
    private javax.swing.JLabel txtSongNameAfterSearch;
    // End of variables declaration//GEN-END:variables
}
