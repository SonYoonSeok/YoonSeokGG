package GameHistory.gamehistory.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParticipantStatsDto {

    private int participantId;
    private int item0;
    private int item1;
    private int item2;
    private int item3;
    private int item4;
    private int item5;
    private int item6;
    private int totalUnitsHealed;
    private int goldEarned;
    private int largestMultiKill;
    private boolean firstInhibitorKill;
    private long physicalDamageTaken;
    private int nodeNeutralizeAssist;
    private int totalPlayerScore;
    private int champLevel;
    private Long damageDealtToObjectives;
    private Long totalDamageTaken;
    private int neutralMinionsKilled;
    private int deaths;
    private int tripleKills;
    private Long magicDamageDealtToChampions;
    private int wardsKilled;
    private int pentaKills;
    private Long damageSelfMitigated;
    private int largestCriticalStrike;
    private int nodeNeutralize;
    private int totalTimeCrowdControlDealt;
    private boolean firstTowerKill;
    private Long magicDamageDealt;
    private int totalScoreRank;
    private int nodeCapture;
    private int wardsPlaced;
    private Long totalDamageDealt;
    private Long timeCCingOthers;
    private Long magicalDamageTaken;
    private int largestKillingSpree;
    private Long totalDamageDealtToChampions;
    private Long physicalDamageDealtToChampions;
    private int neutralMinionsKilledTeamJungle;
    private int totalMinionsKilled;
    private boolean firstInhibitorAssist;
    private int visionWardsBoughtInGame;
    private int objectivePlayerScore;
    private int kills;
    private boolean firstTowerAssist;
    private int combatPlayerScore;
    private int inhibitorKills;
    private int turretKills;
    private Long trueDamageTaken;
    private boolean firstBloodAssist;
    private int nodeCaptureAssist;
    private int assists;
    private int teamObjective;
    private int altarsNeutralized;
    private int goldSpent;
    private Long damageDealtToTurrets;
    private int altarsCaptured;
    private boolean win;
    private Long totalHeal;
    private int unrealKills;
    private Long visionScore;
    private Long physicalDamageDealt;
    private boolean firstBloodKill;
    private int longestTimeSpentLiving;
    private int killingSprees;
    private int sightWardsBoughtInGame;
    private Long trueDamageDealtToChampions;
    private int neutralMinionsKilledEnemyJungle;
    private int doubleKills;
    private Long trueDamageDealt;
    private int quadraKills;
    private int playerScore0;
    private int playerScore1;
    private int playerScore2;
    private int playerScore3;
    private int playerScore4;
    private int playerScore5;
    private int playerScore6;
    private int playerScore7;
    private int playerScore8;
    private int playerScore9;
    private int perk0;
    private int perk0Var1;
    private int perk0Var2;
    private int perk0Var3;
    private int perk1;
    private int perk1Var1;
    private int perk1Var2;
    private int perk1Var3;
    private int perk2;
    private int perk2Var1;
    private int perk2Var2;
    private int perk2Var3;
    private int perk3;
    private int perk3Var1;
    private int perk3Var2;
    private int perk3Var3;
    private int perk4;
    private int perk4Var1;
    private int perk4Var2;
    private int perk4Var3;
    private int perk5;
    private int perk5Var1;
    private int perk5Var2;
    private int perk5Var3;
    private int perkPrimaryStyle;
    private int perkSubStyle;
    private int statPerk0;
    private int statPerk1;
    private int statPerk2;

    public ParticipantStatsDto() {
    }

    public ParticipantStatsDto(int participantId, int item0, int item1, int item2, int item3, int item4, int item5, int item6, int totalUnitsHealed, int goldEarned, int largestMultiKill
            , boolean firstInhibitorKill, long physicalDamageTaken, int nodeNeutralizeAssist, int totalPlayerScore, int champLevel, Long damageDealtToObjectives, Long totalDamageTaken, int neutralMinionsKilled
            , int deaths, int tripleKills, Long magicDamageDealtToChampions, int wardsKilled, int pentaKills, Long damageSelfMitigated, int largestCriticalStrike, int nodeNeutralize
            , int totalTimeCrowdControlDealt, boolean firstTowerKill, Long magicDamageDealt, int totalScoreRank, int nodeCapture, int wardsPlaced, Long totalDamageDealt
            , Long timeCCingOthers, Long magicalDamageTaken, int largestKillingSpree, Long totalDamageDealtToChampions, Long physicalDamageDealtToChampions
            , int neutralMinionsKilledTeamJungle, int totalMinionsKilled, boolean firstInhibitorAssist, int visionWardsBoughtInGame, int objectivePlayerScore
            , int kills, boolean firstTowerAssist, int combatPlayerScore, int inhibitorKills, int turretKills, Long trueDamageTaken, boolean firstBloodAssist
            , int nodeCaptureAssist, int assists, int teamObjective, int altarsNeutralized, int goldSpent, Long damageDealtToTurrets, int altarsCaptured
            , boolean win, Long totalHeal, int unrealKills, Long visionScore, Long physicalDamageDealt, boolean firstBloodKill
            , int longestTimeSpentLiving, int killingSprees, int sightWardsBoughtInGame, Long trueDamageDealtToChampions
            , int neutralMinionsKilledEnemyJungle, int doubleKills, Long trueDamageDealt, int quadraKills
            , int playerScore0, int playerScore1, int playerScore2, int playerScore3, int playerScore4, int playerScore5, int playerScore6, int playerScore7, int playerScore8, int playerScore9
            , int perk0, int perk0Var1, int perk0Var2, int perk0Var3, int perk1, int perk1Var1, int perk1Var2, int perk1Var3, int perk2, int perk2Var1, int perk2Var2, int perk2Var3
            , int perk3, int perk3Var1, int perk3Var2, int perk3Var3, int perk4, int perk4Var1, int perk4Var2, int perk4Var3, int perk5, int perk5Var1, int perk5Var2, int perk5Var3
            , int perkPrimaryStyle, int perkSubStyle, int statPerk0, int statPerk1, int statPerk2) {
        this.participantId = participantId;
        this.item0 = item0;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.item5 = item5;
        this.item6 = item6;
        this.totalUnitsHealed = totalUnitsHealed;
        this.goldEarned = goldEarned;
        this.largestMultiKill = largestMultiKill;
        this.firstInhibitorKill = firstInhibitorKill;
        this.physicalDamageTaken = physicalDamageTaken;
        this.nodeNeutralizeAssist = nodeNeutralizeAssist;
        this.totalPlayerScore = totalPlayerScore;
        this.champLevel = champLevel;
        this.damageDealtToObjectives = damageDealtToObjectives;
        this.totalDamageTaken = totalDamageTaken;
        this.neutralMinionsKilled = neutralMinionsKilled;
        this.deaths = deaths;
        this.tripleKills = tripleKills;
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
        this.wardsKilled = wardsKilled;
        this.pentaKills = pentaKills;
        this.damageSelfMitigated = damageSelfMitigated;
        this.largestCriticalStrike = largestCriticalStrike;
        this.nodeNeutralize = nodeNeutralize;
        this.totalTimeCrowdControlDealt = totalTimeCrowdControlDealt;
        this.firstTowerKill = firstTowerKill;
        this.magicDamageDealt = magicDamageDealt;
        this.totalScoreRank = totalScoreRank;
        this.nodeCapture = nodeCapture;
        this.wardsPlaced = wardsPlaced;
        this.totalDamageDealt = totalDamageDealt;
        this.timeCCingOthers = timeCCingOthers;
        this.magicalDamageTaken = magicalDamageTaken;
        this.largestKillingSpree = largestKillingSpree;
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
        this.neutralMinionsKilledTeamJungle = neutralMinionsKilledTeamJungle;
        this.totalMinionsKilled = totalMinionsKilled;
        this.firstInhibitorAssist = firstInhibitorAssist;
        this.visionWardsBoughtInGame = visionWardsBoughtInGame;
        this.objectivePlayerScore = objectivePlayerScore;
        this.kills = kills;
        this.firstTowerAssist = firstTowerAssist;
        this.combatPlayerScore = combatPlayerScore;
        this.inhibitorKills = inhibitorKills;
        this.turretKills = turretKills;
        this.trueDamageTaken = trueDamageTaken;
        this.firstBloodAssist = firstBloodAssist;
        this.nodeCaptureAssist = nodeCaptureAssist;
        this.assists = assists;
        this.teamObjective = teamObjective;
        this.altarsNeutralized = altarsNeutralized;
        this.goldSpent = goldSpent;
        this.damageDealtToTurrets = damageDealtToTurrets;
        this.altarsCaptured = altarsCaptured;
        this.win = win;
        this.totalHeal = totalHeal;
        this.unrealKills = unrealKills;
        this.visionScore = visionScore;
        this.physicalDamageDealt = physicalDamageDealt;
        this.firstBloodKill = firstBloodKill;
        this.longestTimeSpentLiving = longestTimeSpentLiving;
        this.killingSprees = killingSprees;
        this.sightWardsBoughtInGame = sightWardsBoughtInGame;
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
        this.neutralMinionsKilledEnemyJungle = neutralMinionsKilledEnemyJungle;
        this.doubleKills = doubleKills;
        this.trueDamageDealt = trueDamageDealt;
        this.quadraKills = quadraKills;
        this.playerScore0 = playerScore0;
        this.playerScore1 = playerScore1;
        this.playerScore2 = playerScore2;
        this.playerScore3 = playerScore3;
        this.playerScore4 = playerScore4;
        this.playerScore5 = playerScore5;
        this.playerScore6 = playerScore6;
        this.playerScore7 = playerScore7;
        this.playerScore8 = playerScore8;
        this.playerScore9 = playerScore9;
        this.perk0 = perk0;
        this.perk0Var1 = perk0Var1;
        this.perk0Var2 = perk0Var2;
        this.perk0Var3 = perk0Var3;
        this.perk1 = perk1;
        this.perk1Var1 = perk1Var1;
        this.perk1Var2 = perk1Var2;
        this.perk1Var3 = perk1Var3;
        this.perk2 = perk2;
        this.perk2Var1 = perk2Var1;
        this.perk2Var2 = perk2Var2;
        this.perk2Var3 = perk2Var3;
        this.perk3 = perk3;
        this.perk3Var1 = perk3Var1;
        this.perk3Var2 = perk3Var2;
        this.perk3Var3 = perk3Var3;
        this.perk4 = perk4;
        this.perk4Var1 = perk4Var1;
        this.perk4Var2 = perk4Var2;
        this.perk4Var3 = perk4Var3;
        this.perk5 = perk5;
        this.perk5Var1 = perk5Var1;
        this.perk5Var2 = perk5Var2;
        this.perk5Var3 = perk5Var3;
        this.perkPrimaryStyle = perkPrimaryStyle;
        this.perkSubStyle = perkSubStyle;
        this.statPerk0 = statPerk0;
        this.statPerk1 = statPerk1;
        this.statPerk2 = statPerk2;
    }
}
